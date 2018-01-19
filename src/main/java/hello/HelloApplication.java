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
<<<<<<< HEAD
		return "Hello Openshift from HCL - SID";
=======
		return "Hello Openshift from HCLTechhhhhhh";
>>>>>>> 5c4407702f2fecd7ad7dfd8a387b09d2c873870b
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
