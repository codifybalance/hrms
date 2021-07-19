package HRMSDemo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer>{
	Image getByEmployeeId(int employeeId);
}
