package HRMSDemo.hrms.api.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.ResumeCoverLetterService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeCoverLetter;
import HRMSDemo.hrms.entities.concretes.ResumeEducation;

@RestController
@RequestMapping("/api/resume_cover_letters")
public class ResumeCoverLetterController {
	private ResumeCoverLetterService resumeCoverLetterService;

	public ResumeCoverLetterController(ResumeCoverLetterService resumeCoverLetterService) {
		super();
		this.resumeCoverLetterService = resumeCoverLetterService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody ResumeCoverLetter resumeCoverLetter) {
		return this.resumeCoverLetterService.add(resumeCoverLetter);
	}
	@GetMapping("/findAllByResumeId")
	DataResult<List<ResumeCoverLetter>> findAllByResumeId(int resumeId) {
		return this.resumeCoverLetterService.findAllByResumeId(resumeId);
	}


}
