package hello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


@RestController
@SpringBootApplication
public class HelloApplication {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Openshift from HCL!!!!";
	}
	
	
	
	@Value("${other.openshift.app.service.url:http://browser-service:8080}")
        private String remoteURL;
	
	@RequestMapping("/other-service")
        public String getemployeeById() throws JsonProcessingException {
		

		String browserService = "remoteURL";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> browserResponse = null;
		try {
			browserResponse = restTemplate.exchange(browserService, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(browserResponse.getBody());

		return ("[" + browserResponse.getBody() + "]");

	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args); 
	}
}
