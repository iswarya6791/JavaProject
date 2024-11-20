package RestAssured_Automation.RestAssured_Automation;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostReq_Test {
	@Test
	private void post() {
		RestAssured.baseURI = "https://gorest.co.in/public/v2/users/";
		RequestSpecification postreq = RestAssured.given();
		
		
		String token="b2bfb21129889eb1b6f29ddc8689bcc058027de1c29ee33a70c6b442f164192a";
		
		postreq.headers("Authorization", "Bearer " + token);
		postreq.headers("Content-Type","application/json");
		
		
		JSONObject obj=new JSONObject();
		obj.put("name", "Iswarya7666");
		obj.put("email", "Aathvika777799@gmail.com");
		obj.put("gender", "female");
		obj.put("status", "Active");
		postreq.body(obj);
		
		
		Response postresponse = postreq.request(Method.POST);
		String Responsebody = postresponse.body().asString();
		System.out.println(Responsebody);
		
		
		
		
		
	
		
		

	}
	

}
