package HRMSDemo.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.ResumeExperience;

public interface ResumeExperienceDao  extends JpaRepository<ResumeExperience,Integer>{
	
	    List<ResumeExperience> findAllByResumeId(int resumeId);
		List<ResumeExperience> findAllByResumeIdOrderByEndDateDesc(int resumeId);
		
}
