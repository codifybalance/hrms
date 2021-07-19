package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Resume;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;

public interface ResumeService {
	Result add(Resume resume);
	Result update(Resume resume,int candidateId,int resumeId);
	DataResult<List<Resume>> findAllByCandidateId(int candidateId);
//	Result findByCandidateIdAndResumeId(int candidateId,int resumeId);
	DataResult<List<Resume>> findAll();
}
