package HRMSDemo.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.ResumeLink;

public interface ResumeLinkDao extends JpaRepository<ResumeLink, Integer>{
	
	List<ResumeLink> findAllByResumeId(int resumeId);

}