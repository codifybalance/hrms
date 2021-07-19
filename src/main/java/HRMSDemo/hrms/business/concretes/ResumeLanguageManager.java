package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.ResumeLanguageService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeLanguageDao;
import HRMSDemo.hrms.entities.concretes.ResumeLanguage;
import HRMSDemo.hrms.entities.concretes.ResumeSkill;

@Service
public class ResumeLanguageManager implements ResumeLanguageService{

	private ResumeLanguageDao resumeLanguageDao;

	@Autowired
	public ResumeLanguageManager(ResumeLanguageDao resumeLanguageDao) {
		super();
		this.resumeLanguageDao = resumeLanguageDao;
	}
	
	@Override
	public Result add(ResumeLanguage resumeLanguage) {
		this.resumeLanguageDao.save(resumeLanguage);
		return new SuccessDataResult<ResumeSkill>("beceriler eklendi");
	}

	@Override
	public DataResult<List<ResumeLanguage>> findAllByResumeId(int resumeId) {
		return new SuccessDataResult<List<ResumeLanguage>>(this.resumeLanguageDao.findAllByResumeId(resumeId));

	}

}
