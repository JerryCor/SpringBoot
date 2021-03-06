package iego.jerrycor.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import iego.jerrycor.model.User;




@SpringBootApplication
@Controller
@EnableAutoConfiguration
@RequestMapping("demo")
public class SpringbootDemoApplication {
	
	@RequestMapping("index")
	public String index(Model model){
		User user = new User();
		user.setName("JerryCor");
		user.setIntroduce("Hello World!");
		user.setGender(Integer.valueOf(1));
		model.addAttribute("user", user);
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
