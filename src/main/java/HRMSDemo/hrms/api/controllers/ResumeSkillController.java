package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HRMSDemo.hrms.business.abstracts.ResumeSkillService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ResumeLanguage;
import HRMSDemo.hrms.entities.concretes.ResumeSkill;

@RestController
@RequestMapping("/api/resume_skills")
public class ResumeSkillController {
	private ResumeSkillService resumeSkillService;

	public ResumeSkillController(ResumeSkillService resumeSkillService) {
		super();
		this.resumeSkillService = resumeSkillService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody ResumeSkill resumeLanguage){
		return this.resumeSkillService.add(resumeLanguage);
	}
	

	@GetMapping("/findAllByResumeId")
	public DataResult<List<ResumeSkill>> findAllByResumeId(int resumeId){
		return this.resumeSkillService.findAllByResumeId(resumeId);
	}
}
