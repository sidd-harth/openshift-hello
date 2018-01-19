package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Openshift from HCL - SID";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
