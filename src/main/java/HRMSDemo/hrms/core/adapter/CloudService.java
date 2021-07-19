package HRMSDemo.hrms.core.adapter;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.entities.concretes.Image;

public interface CloudService {
	@SuppressWarnings("rawtypes")
	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
