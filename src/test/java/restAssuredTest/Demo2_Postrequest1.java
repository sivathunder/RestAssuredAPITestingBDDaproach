package restAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo2_Postrequest1 {
	
	public static HashMap map = new HashMap();
	
	
	@BeforeClass 
	public void postdata(){
		map.put("FirstName", RESTUtils.getFirstName());
		map.put("LastName", RESTUtils.getLastName());
		map.put("UserName", RESTUtils.getUserName());
		map.put("Password", RESTUtils.getPassword());
		map.put("Email", RESTUtils.getEmail());
		
		RestAssured.baseURI = "http;//restapi.demoqa.com/customer";
		RestAssured.basePath = "/register";
		System.out.println(map.toString());
	}
	
	
	@Test
	public void testpost() {
		
		//for POST provide prerequistics in the given section
		given()
			.contentType("application/json")
			.body(map)
		
		.when()
			.post()
		.then()
			.statusCode(201)
			.and()
			.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
			.and()
			.body("Message",equalTo("Operation Completed Succesful"));
			
	
	}

}
