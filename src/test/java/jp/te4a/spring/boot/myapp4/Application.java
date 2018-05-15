package jp.te4a.spring.boot.myapp4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jp.te4a.spring.boot.myapp5.MyBootApp4Application;

@SpringBootApplication
public class Application{
	public static void main (String[] args) {
		SpringApplication.run(MyBootApp4Application.class, args);
	}
}
