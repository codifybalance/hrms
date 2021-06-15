package HRMSDemo.hrms.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.EmployerService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.ErrorResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.EmployerDao;
import HRMSDemo.hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	private boolean validationForEmployer(Employer employer) {
		if (Objects.isNull(employer.getCompanyName()) || Objects.isNull(employer.getWebAddress()) || Objects.isNull(employer.getEmail()) 
				|| Objects.isNull(employer.getPhoneNumber()) || Objects.isNull(employer.getPassword())){
			return false;
		}
		
	  return true;
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public DataResult<Employer> getByEmail(String email) {
		return new SuccessDataResult<Employer>(this.employerDao.findByEmailEquals(email));
	}
	
	@Override
	public Result add(Employer employer) {
		if(getByEmail(employer.getEmail()).getData()!=null){
			return new ErrorResult("This email address already exists.");
		}
		if(!this.validationForEmployer(employer)) {
			return new ErrorResult("Check your information again.");
		}
		this.employerDao.save(employer);
		return new SuccessResult("Employer  added.");
		
	}
	
	

}
