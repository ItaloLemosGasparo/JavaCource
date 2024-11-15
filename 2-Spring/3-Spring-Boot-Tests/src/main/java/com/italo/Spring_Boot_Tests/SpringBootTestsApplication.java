package com.italo.Spring_Boot_Tests;

import com.italo.Spring_Boot_Tests.models.desktop;
import com.italo.Spring_Boot_Tests.models.developer;
import com.italo.Spring_Boot_Tests.service.desktopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static java.awt.SystemColor.desktop;

@SpringBootApplication
public class SpringBootTestsApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTestsApplication.class, args);

		developer dev = context.getBean(developer.class);

		System.out.println("Name:" + dev.getName());
		System.out.println("Age: "+dev.getAge());
		System.out.println("Gender:"+dev.getGender());

		desktopService service = context.getBean(desktopService.class);
		if (service.isGoodForPrograming((desktop) dev.comp)){
			System.out.println("Dev's desktop is good for programing...");
			service.addDesktop((desktop) dev.comp);
		}

		dev.code();
		dev.comp.compile();

	}
}
