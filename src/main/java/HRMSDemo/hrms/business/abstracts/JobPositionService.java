package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	DataResult<JobPosition> getJobByName(String name);
}
