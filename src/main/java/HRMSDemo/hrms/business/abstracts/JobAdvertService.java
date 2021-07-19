package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
	DataResult<List<JobAdvert>> getAll();
	Result add(JobAdvert jobAdvert);
    DataResult<JobAdvert> getById(int job_id);
	
//	DataResult<JobAdvert> getByJobDescription(String jobDescription); 
//	
//	DataResult<JobAdvert> getByJobAdvertAdNameAndJobPosition_JobPositionId(String adName , String jobPositionId);
//	
//	DataResult<List<JobAdvert>> getByJobAdvertAdNameOrJobPosition_JobPositionId(String adName , String jobPositionId);
//	
//	DataResult<List<JobAdvert>> getByJobPositionIn(List<Integer> job_positions);
//
//	DataResult<List<JobAdvert>> getByAdNameContains(String adName);
//	
//	DataResult<List<JobAdvert>> getByJobDescriptionStartsWith(String jobDescription);
//	
//	DataResult<List<JobAdvert>> getByNameAndJobPosition(String adName, int Id);
    
    
    DataResult<List<JobAdvert>> findByIsActiveTrueOrderByApplicationDeadline();

    DataResult<List<JobAdvert>> findByIsActiveTrueAndEmployer_Id(int employerId);
	
    DataResult<List<JobAdvert>> findByIsActiveTrue();

    //DataResult<JobAdvert> findByIdAndEmployer(int user_id);
	  
}
