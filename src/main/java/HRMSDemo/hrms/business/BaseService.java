package HRMSDemo.hrms.business;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;

public interface BaseService <T, Id> {
	Result add(T entity);

	Result delete(T entity);
	
	Result update(T entity);

	DataResult<List<T>> getAll();

	DataResult<T> getById(Id id);
}
