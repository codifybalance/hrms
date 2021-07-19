package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeSkill;

public interface ResumeSkillService {
	Result add(ResumeSkill resumeSkill);
	DataResult<List<ResumeSkill>> findAllByResumeId(int resumeId);

}
