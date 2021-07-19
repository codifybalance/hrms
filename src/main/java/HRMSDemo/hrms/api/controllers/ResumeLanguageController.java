package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HRMSDemo.hrms.business.abstracts.ResumeLanguageService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeLanguage;
import HRMSDemo.hrms.entities.concretes.ResumeLink;

@RestController
@RequestMapping("/api/resume_languages")
public class ResumeLanguageController {
	
	private ResumeLanguageService resumeLanguageService;

	public ResumeLanguageController(ResumeLanguageService resumeLanguageService) {
		super();
		this.resumeLanguageService = resumeLanguageService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody ResumeLanguage resumeLanguage){
		return this.resumeLanguageService.add(resumeLanguage);
	}
	

	@GetMapping("/findAllByResumeId")
	public DataResult<List<ResumeLanguage>> findAllByResumeId(int resumeId){
		return this.resumeLanguageService.findAllByResumeId(resumeId);
	}
}
