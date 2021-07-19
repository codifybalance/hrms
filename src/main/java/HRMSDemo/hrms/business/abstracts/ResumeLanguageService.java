package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeLanguage;

public interface ResumeLanguageService {
	Result add(ResumeLanguage resumeLanguageDto);
	DataResult<List<ResumeLanguage>> findAllByResumeId(int resumeId);

}
