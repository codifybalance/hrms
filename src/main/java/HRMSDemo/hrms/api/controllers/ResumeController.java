package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.ResumeService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Resume;


@RestController
@RequestMapping("/api/resumes")
public class ResumeController {

	private ResumeService resumeService;

	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}

//	@PostMapping("/add")
//	Result add(Resume resume){
//		return this.resumeService.add(resume);
//	}
//	
//	@PostMapping("/update")
//	Result update(Resume resume,int candidateId,int resumeId){
//		return this.resumeService.add(resume);
//	}
	
	@GetMapping("/findAllByCandidateId")
	DataResult<List<Resume>> findAllByCandidateId(int candidateId)
	{
		return this.resumeService.findAllByCandidateId(candidateId);
	}

	@GetMapping("/findAll")
	DataResult<List<Resume>> findAll(){
		return this.resumeService.findAll();
	}
	
	
}
