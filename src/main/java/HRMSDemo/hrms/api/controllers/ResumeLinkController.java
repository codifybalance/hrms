package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HRMSDemo.hrms.business.abstracts.ResumeLinkService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeExperience;
import HRMSDemo.hrms.entities.concretes.ResumeLink;

@RestController
@RequestMapping("/api/resume_links")
public class ResumeLinkController {
	private ResumeLinkService resumeLinkService;

	public ResumeLinkController(ResumeLinkService resumeLinkService) {
		super();
		this.resumeLinkService = resumeLinkService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody ResumeLink resumeLink){
		return this.resumeLinkService.add(resumeLink);
	}
	

	@GetMapping("/findAllByResumeId")
	public DataResult<List<ResumeLink>> findAllByResumeId(int resumeId){
		return this.resumeLinkService.findAllByResumeId(resumeId);
	}

}
