package HRMSDemo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	Employee getById(int id);

}
