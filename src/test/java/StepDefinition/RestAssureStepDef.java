package StepDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import RestWebService.CreatingOrder;
import RestWebService.GetToken;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RestAssureStepDef {

	GetToken generateToken = new GetToken();
	CreatingOrder createOrder = new CreatingOrder();

	@Given("Generate Token for following Client")
	public void Generate_Token_for_following_Client(List<Map<String, String>> clientDetails) {

		String clientName = clientDetails.get(0).get("clientName");
		String clientEmail = clientDetails.get(0).get("clientEmail");
		
		Map<String, Object> requestParms = new HashMap<String, Object>();
    	requestParms.put("clientName", clientName);
    	requestParms.put("clientEmail", clientEmail);
    	
    	generateToken.send_Post_Request_Token(requestParms);

	}

	@When("I Create Order for following tools")
	public void I_Create_Order_for_following_tools(List<Map<String, String>> toolDetails) {
		
		String toolId = toolDetails.get(0).get("toolId");
		String customerName = toolDetails.get(0).get("customerName");
		
		Map<String, Object> requestParms = new HashMap<String, Object>();
    	requestParms.put("toolId", toolId);
    	requestParms.put("customerName", customerName);
    	
    	createOrder.send_Post_Request_Order(requestParms);
	}

	@Then("the order created sucessfully")
	public void the_order_created_sucessfully() {
		
		createOrder.order_confirmation();
	}

}
