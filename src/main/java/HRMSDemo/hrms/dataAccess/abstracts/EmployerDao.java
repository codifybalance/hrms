package HRMSDemo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

	Employer findByEmailEquals(String email);

}
