package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.ResumeSkillService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeSkillDao;
import HRMSDemo.hrms.entities.concretes.ResumeExperience;
import HRMSDemo.hrms.entities.concretes.ResumeSkill;

@Service
public class ResumeSkillManager implements ResumeSkillService{
	private ResumeSkillDao resumeSkillDao;

	@Autowired
	public ResumeSkillManager(ResumeSkillDao resumeSkillDao) {
		super();
		this.resumeSkillDao = resumeSkillDao;
	}

	@Override
	public Result add(ResumeSkill resumeSkill) {
		this.resumeSkillDao.save(resumeSkill);
		return new SuccessDataResult<ResumeSkill>("beceriler eklendi");
	}


	@Override
	public DataResult<List<ResumeSkill>> findAllByResumeId(int resumeId) {
		return new SuccessDataResult<List<ResumeSkill>>(this.resumeSkillDao.findAllByResumeId(resumeId));
	}



}
