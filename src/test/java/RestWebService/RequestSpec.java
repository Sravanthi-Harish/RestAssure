package RestWebService;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {
	
	RequestSpecification ReqSpec;
	
	RequestSpec() {

		String url = "https://simple-tool-rental-api.glitch.me";
		ReqSpec = new RequestSpecBuilder().setContentType("application/json")
				.addHeader("Content-Type", "application/json").setBaseUri(url).build();

	}
}
