package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.entities.User;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;


public interface UserService {
	
	Result add(User user);
	DataResult<User> findByEmail(String email);
	DataResult<List<User>> getAll();

}


