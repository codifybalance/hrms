package HRMSDemo.hrms.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.CandidateService;
import HRMSDemo.hrms.core.adapter.MernisService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.ErrorResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CandidateDao;
import HRMSDemo.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	private CandidateDao candidateDao;
	//private MernisService mernisService;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidatesDao) {
			//,MernisService mernisService	
		super();
		this.candidateDao = candidatesDao;
		//this.mernisService = mernisService;
	}
	
	private boolean validationForCandidate(Candidate candidate) {
		if (Objects.isNull(candidate.getNationalityIdentity()) || Objects.isNull(candidate.getFirstName()) || Objects.isNull(candidate.getLastName()) 
				|| Objects.isNull(candidate.getEmail()) || Objects.isNull(candidate.getPassword()) || Objects.isNull(candidate.getBirthOfYear())) {
			return false;
		}
		
	  return true;
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(),"Data listed");
	}
	
	@Override
	public DataResult<Candidate> getByEmail(String email) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getByEmail(email));
	}
	
	@Override
	public DataResult<Candidate> getByNationalityIdentity(String nationalityIdentity) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getByNationalityIdentity(nationalityIdentity));
	}

	@Override
	public Result add(Candidate candidate) {
		//if(!mernisService.checkIfRealCandidate(candidate)){
		//return new ErrorResult("Not a valid person");
     	//}
		//else
		if(!validationForCandidate(candidate)) {
			return new ErrorResult("Check your information again.");
		}
		if(getByEmail(candidate.getEmail()).getData()!=null){
			return new ErrorResult("This email address already exists.");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate  added.");
	}

	@Override
	public DataResult<Candidate> getById(int id) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getById(id));
	}





}
