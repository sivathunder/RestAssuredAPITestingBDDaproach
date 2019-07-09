package restAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo4_DELETEReq {
	
//	public static HashMap map = new HashMap();
//	
//	public static String empname = RESTUtils.getEmpname();
//	public static String empage = RESTUtils.getEmpage();
//	public static String empsal = RESTUtils.getEmpsal();
//	int emp_id = 11254;
//	
//	
//	@BeforeClass 
//	public void deleteEmployeerequest(){
//		map.put("name", empname);
//		map.put("salary", empsal);
//		map.put("age", empage);
//		
		//		
//		System.out.println(map.toString());
//	}
	
	
	@Test
	public void testDelete() {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/delete/11493";
		
		Response response =  
		
		//for POST provide prerequistics in the given section
		given()
			//.contentType("application/json")
			//.body(map)
		
		.when()
			.post()
		.then()
			.statusCode(405)
			.log().all()
			.extract().response();
			
			String jsonresponse = response.asString();
			Assert.assertEquals(jsonresponse.contains("succesfully! deleted records"),true);
			
	
	}

}
