package RestWebService;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.response.Response;

public class GetToken extends RequestSpec {
		
		public static String token;

		public void send_Post_Request_Token(Map<String, Object> requestParms) {

			Response res = 
					given().spec(ReqSpec).contentType("application/json").body(requestParms).post("/api-clients").
					then().assertThat().extract().response();
			
			token = res.body().jsonPath().get("accessToken");
			System.out.println(token);

		}

	}


