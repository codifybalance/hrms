package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();

	Result add(User user);
}
