package com.RestAssured;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BasicMethods {

	@Test(enabled = false)
	private void getMethod() {
RestAssured.baseURI="https://reqres.in/";
Response response = RestAssured.given()
.when()
.get("/api/users/2")
.then()
.log()
.all()
.statusCode(200)
.extract()
.response();
int statusCode = response.getStatusCode();
String actual = String.valueOf(statusCode);
org.testng.Assert.assertEquals("200", actual);
System.out.println("The Response received is: "+response.asString());


	}
	@Test
	private void postMethod() {
RestAssured.baseURI="https://reqres.in/";
RequestSpecification requestspecify = RestAssured.given();
JsonObject jo=new JsonObject();
jo.addProperty("Name", "Balaji");
jo.addProperty("JobRole", "SDET");
Response put = requestspecify.put("/api/users");
ResponseBody<?> body = put.getBody();
System.out.println(put.getStatusLine());
System.out.println(body.asString());

}
}
