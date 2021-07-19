package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.JobAdvertService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.dataAccess.abstracts.JobAdvertDao;
import HRMSDemo.hrms.entities.concretes.Candidate;
import HRMSDemo.hrms.entities.concretes.JobAdvert;
@Service
public class JobAdvertManager implements JobAdvertService{
	private JobAdvertDao jobAdvertDao;
	
	@Autowired      
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}
	
	
	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>
		(this.jobAdvertDao.findAll(),"Tüm ilanlar listelendi");
				
	}
	
	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessDataResult<JobAdvert>("ilan eklendi");
	}


	@Override
	public DataResult<JobAdvert> getById(int id) {
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getByJobId(id));
	}




	@Override
	public DataResult<List<JobAdvert>> findByIsActiveTrueAndEmployer_Id(int employerId) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrueAndEmployer_Id(employerId));
	}


	@Override
	public DataResult<List<JobAdvert>> findByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrue());
	}


//	@Override
//	public DataResult<JobAdvert> findByIdAndEmployer(int user_id) {
//		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.findByIdAndEmployer(user_id));
//	}


	@Override
	public DataResult<List<JobAdvert>> findByIsActiveTrueOrderByApplicationDeadline() {
		return new SuccessDataResult<List<JobAdvert>>
		(this.jobAdvertDao.findByIsActiveTrueOrderByApplicationDeadline(),
				"ApplicationDeadline ilanlar listelendi");
	}





}
