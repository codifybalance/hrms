package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
