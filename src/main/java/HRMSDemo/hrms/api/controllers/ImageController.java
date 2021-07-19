package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import HRMSDemo.hrms.business.abstracts.ImageService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
@CrossOrigin
public class ImageController {
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		this.imageService=imageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<Image> getById(@RequestParam(value = "imageId") int imageId){
		return this.imageService.getById(imageId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestParam(value = "employeeId") int jobseekerId,@RequestParam(value = "imageFile") MultipartFile imageFile) {
		return this.imageService.add(jobseekerId,imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Image image) {
		return this.imageService.update(image);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Image image) {
		return this.imageService.delete(image);
	}
}
