package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeCoverLetter;

public interface ResumeCoverLetterService {
	Result add(ResumeCoverLetter resumeCoverLetter);
	DataResult<List<ResumeCoverLetter>> findAllByResumeId(int resumeId);
}
