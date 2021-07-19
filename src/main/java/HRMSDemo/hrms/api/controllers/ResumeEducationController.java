package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.ResumeEducationService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeEducation;

@RestController
@RequestMapping("/api/resume_educations")
public class ResumeEducationController {
	
	private ResumeEducationService resumeEducationService;

	public ResumeEducationController(ResumeEducationService resumeEducationService) {
		super();
		this.resumeEducationService = resumeEducationService;
	}

	@PostMapping("/add")
	Result add(@RequestBody ResumeEducation resumeEducationme){
		return this.resumeEducationService.add(resumeEducationme);
	}
//	
//	@PostMapping("/update")
//	Result update(Resume resume,int candidateId,int resumeId){
//		return this.resumeService.add(resume);
//	}
	
	@GetMapping("/findAllByResumeId")
	DataResult<List<ResumeEducation>> findAllByResumeId(int resumeId)
	{
		return this.resumeEducationService.findAllByResumeId(resumeId);
	}

	@GetMapping("/findAllByResumeIdOrderByEndDateDesc")
	DataResult<List<ResumeEducation>> findAllByResumeIdOrderByEndDateDesc(int resumeId){
		return this.resumeEducationService.findAllByResumeIdOrderByEndDateDesc(resumeId);
	}
	
}
