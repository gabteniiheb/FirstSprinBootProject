package ensit.dep.info.projects.api;

import ensit.dep.info.projects.api.projectPackage.Project;
import ensit.dep.info.projects.api.projectPackage.Type;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class TpProjectsManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpProjectsManagementApplication.class, args);
	}



	}

