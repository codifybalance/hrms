package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.ResumeExperienceService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeExperience;

@RestController
@RequestMapping("/api/resume_experiences")
public class ResumeExperienceControler {

	@Autowired
	private ResumeExperienceService resumeExperienceService;

	public ResumeExperienceControler(ResumeExperienceService resumeExperienceService) {
		super();
		this.resumeExperienceService = resumeExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeExperience resumeExperience){
		return this.resumeExperienceService.add(resumeExperience);
	}
	

	@GetMapping("/findAllByResumeId")
	public DataResult<List<ResumeExperience>> findAllByResumeId(int resumeId){
		return this.resumeExperienceService.findAllByResumeId(resumeId);
	}
	@GetMapping("/findAllByResumeIdOrderByEndDateDesc")
	public DataResult<List<ResumeExperience>> findAllByResumeIdOrderByEndDateDesc(int resumeId){
		return this.resumeExperienceService.findAllByResumeIdOrderByEndDateDesc(resumeId);
	}
	
}
