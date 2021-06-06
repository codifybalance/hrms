package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.JobPositionService;
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
	
	
	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}

}
