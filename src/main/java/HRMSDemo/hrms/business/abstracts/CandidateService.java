package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Candidate;


public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
	DataResult<Candidate> getById(int id);
	DataResult<Candidate> getByEmail(String email);
	DataResult<Candidate> getByNationalityIdentity(String nationalityIdentity);
	
}
