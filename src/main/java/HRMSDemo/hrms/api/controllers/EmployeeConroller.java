package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.EmployeeService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Employee;

@RestController
@RequestMapping
public class EmployeeConroller {

	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeConroller(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee){
		return this.employeeService.add(employee);
	}

	@GetMapping("/getById")
	public DataResult<Employee> getById(@RequestParam("id") int id){
		return this.employeeService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
}
