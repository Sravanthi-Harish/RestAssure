package RestWebService;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RestClass {
	
	RequestSpecification secRequest;

	RestClass() {

		String url = "https://simple-tool-rental-api.glitch.me";
		secRequest = new RequestSpecBuilder().setContentType("application/json")
				.addHeader("Content-Type", "application/json").setBaseUri(url).build();

	}


}
