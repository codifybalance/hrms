package HRMSDemo.hrms.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import HRMSDemo.hrms.business.BaseService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Image;

public interface ImageService extends BaseService<Image,Integer>{
	Result add(int employeeId,MultipartFile imageFile);
}
