package HRMSDemo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{
		Candidate getByNationalityIdentity(String nationalityIdentity); 
	Candidate getById(int id);
	Candidate getByEmail(String email); 
}
