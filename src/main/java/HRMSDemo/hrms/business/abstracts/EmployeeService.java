package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();

	DataResult<Employee> getById(int id);

	Result add(Employee employee);
}
