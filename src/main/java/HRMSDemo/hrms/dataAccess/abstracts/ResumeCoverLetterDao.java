package HRMSDemo.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.Resume;
import HRMSDemo.hrms.entities.concretes.ResumeCoverLetter;

public interface ResumeCoverLetterDao extends JpaRepository<ResumeCoverLetter, Integer>{
//		 List<ResumeCoverLetter> findAllById (int resumeId);
		 List<ResumeCoverLetter> findAllByResumeId(int resumeId);

}
