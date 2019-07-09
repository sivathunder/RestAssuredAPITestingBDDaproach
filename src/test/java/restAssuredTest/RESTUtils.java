package restAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RESTUtils {
	
	public static String getFirstName() {
		String generatedString =RandomStringUtils.randomAlphabetic(1);
		return ("Siva"+generatedString);
	}
	
	public static String getLastName() {
		String generatedString =RandomStringUtils.randomAlphabetic(1);
		return ("Ram"+generatedString);
	}
	
	public static String getUserName() {
		String generatedString =RandomStringUtils.randomAlphabetic(3);
		return ("Siva"+generatedString);
	}
	
	public static String getPassword() {
		String generatedString =RandomStringUtils.randomAlphabetic(3);
		return ("Siva"+generatedString);
	}
	
	public static String getEmail() {
		String generatedString =RandomStringUtils.randomAlphabetic(3);
		return (generatedString+"@gmail.com");
	}
	
	public static String getEmpname() {
		String generatedString =RandomStringUtils.randomAlphabetic(1);
		return ("Siva"+generatedString);
	}
	
	public static String getEmpsal() {
		String generatedString =RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	
	public static String getEmpage() {
		String generatedString =RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}

}
