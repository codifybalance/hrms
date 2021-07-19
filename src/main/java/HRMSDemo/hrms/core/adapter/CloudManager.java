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
				"cloud_name", "codifybalance",
				"api_key", "476932977549833",
				"api_secret", "SVh_CnlCZFwNEM_r7iy1gyDCcXA",
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
