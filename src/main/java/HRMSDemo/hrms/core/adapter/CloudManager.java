package HRMSDemo.hrms.core.adapter;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.ErrorDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class CloudManager implements CloudService{
	
private Cloudinary cloudinary;
	
	public CloudManager() {

		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dumceaten",
				"api_key", "223613328412727",
				"api_secret", "IhKdztXhR4ZbCtvhKGb8_wwWG4Y",
				"secure", true));
		
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		try {
			
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return new ErrorDataResult<Map>();
		
	}

}
