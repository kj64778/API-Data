package com.java.api_demo;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

//import net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.OfGivenField;
public class API_Demo extends OutputData {

	@Test
	public void getmethod() {
		given().queryParam("page", 100)
		.when().get("https://reqres.in/api/users")
		.then().log().all().statusCode(200);
		
	}
	
	@Test
	public void postMethod() {
		String body = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		given().body(body)
		.when().post("https://reqres.in/api/users")
		.then().log().all().statusCode(201);
	}
	
	@Test
	public void get_UserList() {
		given().queryParam("page", 2)
		.when().get("https://reqres.in/api/users")
		.then().assertThat().log().all()
		.and().assertThat();
	}
	
	@Test
	public void getUserNot_Found() {
		given()
		.when().get("https://reqres.in/api/users/23")
		.then().statusCode(404).log().all();
	}
	
	@Test
	public void put_Update() {
		String body = "{\r\n"
				+ "    \"name\": \"Kiran\",\r\n"
				+ "    \"job\": \"Tester\"\r\n"
				+ "}";
		given().body(body)
		.when().put("https://reqres.in/api/users/2")
		.then().statusCode(200).log().all();
	}
	
	@Test
	public void delete() {
		given()
		.when().delete("https://reqres.in/api/users/2")
		.then().statusCode(204).log().all();
	}

	
}
