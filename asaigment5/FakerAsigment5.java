package June2021.qaautomation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FakerAsigment5 {

	@Test
	public void API() {

		Faker faker = new Faker();
		String Email = (faker.name().firstName() + faker.name().lastName() + "@gmail.com");
		String SignUpPayload = "{\"user\":{\"first_name\":\"chevin\",\"last_name\":\"\",\"email\": \"" + Email
				+ "\",\"password\":\"chevin1234\",\"phone_number\":\"+62-81282526385\",\"user_type\":\"User\",\"currency_id\":3}}";

		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";

		System.out.println(SignUpPayload);
		Response response = RestAssured.given().contentType("application/json").body(SignUpPayload).when()
				.post("/users");
		assertEquals(response.getStatusCode(), 200);

	}
}
