package com.java.api_demo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;

public class JsonCompleteDataStored {

	@Test
	public void demo() {

		// JSON data as a string
		String jsonData = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";

		// Parse the JSON string to a JsonObject
		JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();

		// Accessing values from JsonObject
		String name = jsonObject.get("name").getAsString();
		int age = jsonObject.get("age").getAsInt();
		String city = jsonObject.get("city").getAsString();

		// Displaying the extracted data
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);

	}

@Test
public void getSingleUser_data() {
//	String data = given()
//	.when().get("https://reqres.in/api/users/2")
//	.then().extract().path("data");
	
	String data = "{id=2, email=janet.weaver@reqres.in, first_name=Janet, last_name=Weaver, avatar=https://reqres.in/img/faces/2-image.jpg}";
	
	
	//Json String to jsonObject
//	JsonObject jsonObject = JsonParser.parseString(data).getAsJsonObject();
	JsonObject jsonObject = JsonParser.parseString(data).getAsJsonObject();
	
	//Accessing Values from JsonObject
	
	
	
	int id = jsonObject.get("id").getAsInt();
	String email = jsonObject.get("email").getAsString();
	String first_name = jsonObject.get("first_name").getAsString();
	String lastName = jsonObject.get("last_name").getAsString();
	String avatar = jsonObject.get("avatar").getAsString();
	String name = jsonObject.get("name").getAsString();
	
	
	System.out.println(name);
	System.out.println("ID :"+id);
	System.out.println("Email :"+email);
	System.out.println("First Name :"+first_name);
	System.out.println("Last Name :"+lastName);
	System.out.println("Avatar :"+avatar);
	
 }

}
