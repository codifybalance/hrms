package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.ResumeEducationService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeDao;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeEducationDao;
import HRMSDemo.hrms.entities.concretes.Resume;
import HRMSDemo.hrms.entities.concretes.ResumeEducation;

@Service
public class ResumeEducationManager implements ResumeEducationService{
	private ResumeEducationDao resumeEducationDao;
	
	@Autowired
	public ResumeEducationManager(ResumeEducationDao resumeEducationDao) {
		super();
		this.resumeEducationDao = resumeEducationDao;
	}
	
	@Override
	public Result add(ResumeEducation resumeEducation) {
		this.resumeEducationDao.save(resumeEducation);
		return new SuccessDataResult<ResumeEducation>("eğitim bilgileri eklendi");
	}

	@Override
	public DataResult<List<ResumeEducation>> findAllByResumeId(int resumeId) {
		return new SuccessDataResult<List<ResumeEducation>>(this.resumeEducationDao.findAllByResumeId(resumeId));
	}

	@Override
	public DataResult<List<ResumeEducation>> findAllByResumeIdOrderByEndDateDesc(int resumeId) {
		return new SuccessDataResult<List<ResumeEducation>>(this.resumeEducationDao.findAllByResumeIdOrderByEndDateDesc(resumeId));
	}

	@Override
	public Result addAll(List<ResumeEducation> resumeEducations) {
		this.resumeEducationDao.saveAll(resumeEducations);
		return new SuccessDataResult<ResumeEducation>("eğitim bilgileri eklendi");
	}


}
