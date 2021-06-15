package HRMSDemo.hrms.core.adapter;


import java.util.regex.Pattern;


public class EmailAdapter implements EmailCheckService{
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov)(.[A-Z]{2})?$";

	@Override
	public boolean checkIfRealEmail(String email) {

			Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}
}
