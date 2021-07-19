package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeExperience;

public interface ResumeExperienceService {
	Result add(ResumeExperience resumeExperience);
	DataResult<List<ResumeExperience>> findAllByResumeId(int resumeId);
	DataResult<List<ResumeExperience>> findAllByResumeIdOrderByEndDateDesc(int resumeId);
	Result addAll(List<ResumeExperience> resumeExperiences);
}
