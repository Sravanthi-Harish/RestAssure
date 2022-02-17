package RestWebService;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import io.restassured.response.Response;

public class CreatingOrder extends RequestSpec {
	
	 public boolean status;
		
		public void send_Post_Request_Order(Map<String, Object> requestParms) {
			GetToken generateToken = new GetToken();
			Response res = 
					given().spec(ReqSpec).contentType("application/json").
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

