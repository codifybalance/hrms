package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.JobPositionService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.ErrorResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.JobPositionDao;
import HRMSDemo.hrms.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao; 
	
	@Autowired
	public JobPositionManager (JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao =jobPositionDao;
	}
	
	
	/*@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}*/
	
	@Override
	public DataResult<List<JobPosition>> getAll() {

		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),"Data listelendi");
		}


//	@Override
//	public Result add(JobPosition jobPosition) {
//		this.jobPositionDao.save(jobPosition);
//		return new SuccessResult("Ürün eklendi");
//	}
	
	@Override
	public Result add(JobPosition jobPosition) {
		if(getJobByName(jobPosition.getName()).getData() != null){
			return new ErrorResult("Bu pozisyon sistemde zaten var.");
		}
		this.jobPositionDao.save(jobPosition);
	    return new SuccessResult("İş pozisyonu eklendi");
	    }
	
	@Override
	public DataResult<JobPosition> getJobByName(String name) {
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getByName(name));
	}

}
