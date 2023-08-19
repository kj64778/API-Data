package com.java.api_demo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class API_Demo_2 {
	
	@Test
	public void  getAPI() {
		given()
		.when().get("https://reqres.in/api/users/2")
		.then().log().all().statusCode(200);
	}

}
