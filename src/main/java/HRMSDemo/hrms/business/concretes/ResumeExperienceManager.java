package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.ResumeExperienceService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeExperienceDao;
import HRMSDemo.hrms.entities.concretes.ResumeExperience;

@Service
public class ResumeExperienceManager implements ResumeExperienceService{
	private ResumeExperienceDao resumeExperienceDao;
	
	@Autowired
	public ResumeExperienceManager(ResumeExperienceDao resumeExperienceDao) {
		super();
		this.resumeExperienceDao = resumeExperienceDao;
	}
	
	@Override
	public Result add(ResumeExperience resumeExperience) {
		this.resumeExperienceDao.save(resumeExperience);
		return new SuccessDataResult<ResumeExperience>("iş deneyim  bilgileri eklendi");
	}

	@Override
	public DataResult<List<ResumeExperience>> findAllByResumeId(int resumeId) {
		return new SuccessDataResult<List<ResumeExperience>>(this.resumeExperienceDao.findAllByResumeId(resumeId));
	}

	@Override
	public DataResult<List<ResumeExperience>> findAllByResumeIdOrderByEndDateDesc(int resumeId) {
		return new SuccessDataResult<List<ResumeExperience>>(this.resumeExperienceDao.findAllByResumeIdOrderByEndDateDesc(resumeId));
	}

	@Override
	public Result addAll(List<ResumeExperience> resumeExperiences) {
		this.resumeExperienceDao.saveAll(resumeExperiences);
		return new SuccessDataResult<ResumeExperience>("iş deneyim bilgileri eklendi");
	}

}
