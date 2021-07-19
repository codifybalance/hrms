package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.ResumeCoverLetterService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.entities.concretes.ResumeCoverLetter;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeCoverLetterDao;

@Service
public class ResumeCoverLetterManager implements ResumeCoverLetterService{

	private ResumeCoverLetterDao resumeCoverLetterDao;
	@Autowired
	public ResumeCoverLetterManager(ResumeCoverLetterDao resumeCoverLetterDao) {
		super();
		this.resumeCoverLetterDao = resumeCoverLetterDao;
	}
	
	@Override
	public Result add(ResumeCoverLetter resumeCoverLetter) {
		this.add(resumeCoverLetter);
		return new SuccessDataResult<ResumeCoverLetter>("ön yazı eklendi");
	}

	@Override
	public DataResult<List<ResumeCoverLetter>> findAllByResumeId(int resumeId) {
		return new SuccessDataResult<List<ResumeCoverLetter>>(this.resumeCoverLetterDao.findAllByResumeId(resumeId));

	}





}
