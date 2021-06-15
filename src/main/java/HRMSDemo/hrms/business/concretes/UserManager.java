package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import HRMSDemo.hrms.business.abstracts.UserService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.UserDao;
import HRMSDemo.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(
				this.userDao.findAll(),"Users listed");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User added.");
	}

}
