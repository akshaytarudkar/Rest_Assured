package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialUpdateBookingPatchRequest {
	
	public static void main(String[] args) {
		
		RestAssured
		          .given()
		          		.log()
		          		.all()
		          		.baseUri("https://restful-booker.herokuapp.com/")
		          		.basePath("booking/1")
		          		.body("{\r\n"
		          				+ "    \"firstname\" : \"James\",\r\n"
		          				+ "    \"lastname\" : \"Brown\"\r\n"
		          				+ "}")
		          		.contentType(ContentType.JSON)
		          		.header("Authorization" , "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		          .when() 
		                .patch()
		          .then()
		                .log()
		                .all()
		                .assertThat()
		                .statusCode(200);
		          
	}

}
