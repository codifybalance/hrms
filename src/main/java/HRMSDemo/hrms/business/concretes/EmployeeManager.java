package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.EmployeeService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.EmployeeDao;
import HRMSDemo.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(
				this.employeeDao.findAll(),"Employee listed");
	}
	
	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
        return new SuccessResult("Employee added.");		
	}

	@Override
	public DataResult<Employee> getById(int id) {
		return new SuccessDataResult<Employee>(this.employeeDao.getById(id));
	}



}
