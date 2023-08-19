package com.java.api_demo;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Get_Single_user {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void getdatavalidation_ID() {
		int actual = given()
		.when().get("https://reqres.in/api/users/2")
		.then().extract().path("data.id");

		System.out.println("Actual : " + actual);

		int expected = 2;

		System.out.println("Expected : " + expected);
		
		softassert.assertEquals(actual, expected);
		
		
		softassert.assertAll();
	}

	@Test
	public void getdatavalidation_Email() {
		String actual = given()
				.when().get("https://reqres.in/api/users/2")
				.then().extract().path("data.email");

		System.out.println("Actual : " + actual);

		String expected = "janet.weaver@reqres.in";
		System.out.println("Expected : " + expected);

		softassert.assertEquals(actual, expected);
		softassert.assertAll();
//		assertEquals(expected, actual);
	}

	@Test

	public void getdatavalidation_first_name() {
		String actual = given()
				.when().get("https://reqres.in/api/users/2")
				.then().extract().path("data.first_name");

		System.out.println("Actual : " + actual);

		String expected = "Janet";
		System.out.println("Expected : " + expected);

		softassert.assertEquals(actual, expected);
		softassert.assertAll();
	
		
//		assertEquals(expected, actual);
	}

	@Test
	public void getdatavalidation_Data() {
		LinkedHashMap<String, Object> actual = given()
				.when().get("https://reqres.in/api/users/2").then().extract()
				.path("data");

		System.out.println("Actual : " + actual);

//		System.out.println("Expected : " + expected);

//		assertEquals(expected, actual);
	}

}
