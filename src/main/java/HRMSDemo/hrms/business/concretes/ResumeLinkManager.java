package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.ResumeLinkService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeLinkDao;
import HRMSDemo.hrms.entities.concretes.ResumeLink;


@Service
public class ResumeLinkManager implements ResumeLinkService{

	private ResumeLinkDao resumeLinkDao;
	@Autowired
	public ResumeLinkManager(ResumeLinkDao resumeLinkDao) {
		super();
		this.resumeLinkDao = resumeLinkDao;
	}

	@Override
	public Result add(ResumeLink resumeLink) {
		this.resumeLinkDao.save(resumeLink);
		return new SuccessDataResult<ResumeLink>("beceriler eklendi");
	}

	@Override
	public DataResult<List<ResumeLink>> findAllByResumeId(int resumeId) {
		return new SuccessDataResult<List<ResumeLink>>(this.resumeLinkDao.findAllByResumeId(resumeId));
	}



}
