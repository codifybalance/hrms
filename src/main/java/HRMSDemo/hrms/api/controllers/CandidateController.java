package HRMSDemo.hrms.api.controllers;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.CandidateService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.ErrorDataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
	
	private CandidateService candidateService;
	

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
	}
	
	
	  @PostMapping("/add") public Result add(@RequestBody Candidate candidate) {
	  return this.candidateService.add(candidate); }
	 
	
	/*
	 * @PostMapping("/add") public ResponseEntity<?> add(@RequestBody @Valid
	 * Candidate candidate){ return
	 * ResponseEntity.ok(this.candidateService.add(candidate)); }
	 * 
	 * @ExceptionHandler(MethodArgumentNotValidException.class)
	 * 
	 * @ResponseStatus(HttpStatus.BAD_REQUEST) public ErrorDataResult<Object>
	 * handleValidationException (MethodArgumentNotValidException exceptions){
	 * Map<String,String> validationErrors = new HashMap<String, String>();
	 * for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
	 * validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
	 * }
	 * 
	 * ErrorDataResult<Object> errors = new
	 * ErrorDataResult<Object>(validationErrors,"Validation errors"); return errors;
	 * }
	 */

	
}
