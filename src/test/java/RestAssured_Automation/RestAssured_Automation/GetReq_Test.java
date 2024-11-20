package RestAssured_Automation.RestAssured_Automation;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetReq_Test {
	@Test
	private void get() {
		RestAssured.baseURI = "https://gorest.co.in/public/v2/users/7504495";
		RequestSpecification httpreq = RestAssured.given();

		String token = "b2bfb21129889eb1b6f29ddc8689bcc058027de1c29ee33a70c6b442f164192a";
		httpreq.headers("Authorization", "Bearer " + token);
		Response resp = httpreq.request(Method.GET);
		//System.out.println(resp);
		
		  String bodyresp = resp.getBody().asString(); 
		  System.out.println(bodyresp);
		  int statusCode = resp.getStatusCode(); 
		  System.out.println(statusCode);
		  Assert.assertEquals(statusCode, 200);
		  String statusLine = resp.getStatusLine();
		  System.out.println(statusLine);
		  String namefield = resp.getBody().jsonPath().getString("[3].name");
		  System.out.println(namefield);
		  Assert.assertEquals(namefield, "Sweta Gowda");
		  
		  
		  
		 }

}
