package restAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_Getrequest {

	@Test
	public void getWeatherDetails() {
		
		//Always the testcase starts with given()
		given()
		// In the when section we will pass the following what kind we are going to verify  
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Chennai")
		// all the validation will be part of then section
		.then()
			.statusCode(200)
			.statusLine("Http/1.1 200 OK")
			.assertThat().body("City", equalTo("Chennai"))
			.header("Content-Type","application/json");
		
		

	}

}
