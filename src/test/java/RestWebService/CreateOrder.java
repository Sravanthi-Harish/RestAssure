package RestWebService;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import io.restassured.response.Response;



public class CreateOrder extends RestClass {
	
	 public boolean status;

//	public TradeDetails createRecord(String Security, String buySell, String quanatity, String priceInCent) {
//		return new TradeDetails(Security, buySell, quanatity, priceInCent);
//
//	}
	
	public void send_Post_Request_Order(Map<String, Object> requestParms) {
		GenerateToken generateToken = new GenerateToken();
		Response res = 
				given().spec(secRequest).contentType("application/json").
                header("Authorization",generateToken.token).
		body(requestParms).post("/orders").
				then().assertThat().extract().response();
		status = res.body().jsonPath().get("created");
		
	}
	public void order_confirmation(){
		System.out.println("status = "+status);
			assertTrue(status);
		}


		
		

	}

