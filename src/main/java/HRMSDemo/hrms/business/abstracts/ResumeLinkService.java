package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeLink;

public interface ResumeLinkService {
		Result add(ResumeLink resumeLinkDto);
		DataResult<List<ResumeLink>> findAllByResumeId(int resumeId);
}
