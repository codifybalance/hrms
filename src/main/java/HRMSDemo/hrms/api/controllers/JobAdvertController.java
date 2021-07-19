package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.JobAdvertService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/job_advertisement")
public class JobAdvertController {

	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll(){
		return this.jobAdvertService.getAll();
	}
	
	@GetMapping("/applicationDeadline")
	public DataResult<List<JobAdvert>> ApplicationDeadline(){
		return this.jobAdvertService.findByIsActiveTrueOrderByApplicationDeadline();
	}
	
	@GetMapping("/IsActiveTrueAndEmployer")
	public DataResult<List<JobAdvert>> IsActiveTrueAndEmployer(int employerId){
		return this.jobAdvertService.findByIsActiveTrueAndEmployer_Id(employerId);
	}
	
	@GetMapping("/IsActiveTrue")
	public DataResult<List<JobAdvert>> findByIsActiveTrue(){
		return this.jobAdvertService.findByIsActiveTrue();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}
	
}
