package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeEducation;

public interface ResumeEducationService {
	Result add(ResumeEducation resumeEducation);
	DataResult<List<ResumeEducation>> findAllByResumeId(int resumeId);
	DataResult<List<ResumeEducation>> findAllByResumeIdOrderByEndDateDesc(int resumeId);
	Result addAll(List<ResumeEducation> resumeEducations);
}
