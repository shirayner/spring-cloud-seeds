package com.ray.study.springcloud06config01configserver;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloud06Config01ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud06Config01ConfigserverGitApplication.class, args);
	}

}
