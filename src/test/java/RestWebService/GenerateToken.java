package RestWebService;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.response.Response;
import static org.junit.Assert.assertTrue;


public class GenerateToken extends RestClass {
	
	public static String token;

//	public TradeDetails createRecord(String Security, String buySell, String quanatity, String priceInCent) {
//		return new TradeDetails(Security, buySell, quanatity, priceInCent);
//
//	}

	public void send_Post_Request_Token(Map<String, Object> requestParms) {

		Response res = 
				given().spec(secRequest).contentType("application/json").body(requestParms).post("/api-clients").
				then().assertThat().extract().response();
		
		token = res.body().jsonPath().get("accessToken");
		System.out.println(token);

	}

}
