package RestAssured_Automation.RestAssured_Automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutReq_Test {
@Test
	private void PUT() {
		RestAssured.baseURI="https://gorest.co.in/public/v2/users/7504495";
		RequestSpecification putreq = RestAssured.given();
		
		String token="b2bfb21129889eb1b6f29ddc8689bcc058027de1c29ee33a70c6b442f164192a";
		putreq.header("Authorization", "Bearer " + token);
		putreq.header("Content-Type", "application/json");
		JSONObject obj=new JSONObject();
		obj.put("status", "INActive");
		putreq.body(obj);
		Response putresponse = putreq.request(Method.PUT);
		String bodyresponse = putresponse.getBody().asString();
		System.out.println(bodyresponse);
		int statusCode = putresponse.getStatusCode();
		System.out.println(statusCode);
		String statusLine = putresponse.getStatusLine();
		System.out.println(statusLine);
		
	}
}
