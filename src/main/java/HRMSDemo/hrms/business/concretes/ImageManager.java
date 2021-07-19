package HRMSDemo.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import HRMSDemo.hrms.business.abstracts.EmployeeService;
import HRMSDemo.hrms.business.abstracts.ImageService;
import HRMSDemo.hrms.core.adapter.CloudService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.ErrorResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.EmployeeDao;
import HRMSDemo.hrms.dataAccess.abstracts.ImageDao;
import HRMSDemo.hrms.dataAccess.abstracts.JobPositionDao;
import HRMSDemo.hrms.entities.concretes.Employee;
import HRMSDemo.hrms.entities.concretes.Image;
import HRMSDemo.hrms.entities.concretes.JobPosition;
import lombok.var;

@Service
public class ImageManager implements ImageService{
	
	private ImageDao imageDao;
	private EmployeeDao employeeDao;
	private CloudService cloudService;
	
	@Autowired
	public ImageManager(ImageDao imageDao,CloudService cloudService,EmployeeDao employeeDao) {
		
		this.imageDao = imageDao;
		this.cloudService=cloudService;
		this.employeeDao=employeeDao;
		
	}

	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public Result add(int employeeId, MultipartFile imageFile) {
		
		Map<String,String> uploadImage = this.cloudService.uploadImageFile(imageFile).getData();
		
		Image image=new Image();
		Employee employee=this.employeeDao.getOne(employeeId);
		image.setImgLink(uploadImage.get("url"));
		
		this.imageDao.save(image);
		return new SuccessResult("Image added");
		
	}
	
	@Override
	public Result add(Image entity) {
		// TODO Auto-generated method stub
		this.imageDao.save(entity);
		return new SuccessResult("Resim eklendi");
	}

	@Override
	public Result delete(Image entity) {
		// TODO Auto-generated method stub
		imageDao.delete(entity);
		return new SuccessResult("Resim kaydı silindi");
	}

	@Override
	public Result update(Image entity) {
		// TODO Auto-generated method stub
		this.imageDao.save(entity);
		return new SuccessResult("Resim kaydı güncellendi");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"Resimler başarılı şekilde getirildi");
	}

	@Override
	public DataResult<Image> getById(Integer id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Image>(this.imageDao.findById(id).get());
	}
    


}
