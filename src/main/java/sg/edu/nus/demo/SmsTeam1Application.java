package sg.edu.nus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"sg.edu.nus.sms.controllers"})
@EntityScan("sg.edu.nus.sms.models")
@EnableJpaRepositories("sg.edu.nus.sms.repo")
public class SmsTeam1Application {

	public static void main(String[] args) {
		SpringApplication.run(SmsTeam1Application.class, args);
	}

}
