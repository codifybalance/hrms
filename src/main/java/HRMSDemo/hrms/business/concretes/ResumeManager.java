package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.ResumeService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.dataAccess.abstracts.ResumeDao;
import HRMSDemo.hrms.entities.concretes.JobAdvert;
import HRMSDemo.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{

	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessDataResult<Resume>("özgeçmiş eklendi");
	}


	@Override
	public Result update(Resume resume, int candidateId, int resumeId) {
		this.resumeDao.save(resume);
		return new SuccessDataResult<Resume>("özgeçmiş güncellendi");
	}

	@Override
	public DataResult<List<Resume>> findAllByCandidateId(int candidateId) {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAllByCandidateId(candidateId));
	}



	@Override
	public DataResult<List<Resume>> findAll() {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(),"Tüm cv listelendi");
	}



}
