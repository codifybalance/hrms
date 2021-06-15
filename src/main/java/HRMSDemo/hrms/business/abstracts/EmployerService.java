package HRMSDemo.hrms.business.abstracts;

import java.util.List;


import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	DataResult<Employer> getByEmail(String email);
}
