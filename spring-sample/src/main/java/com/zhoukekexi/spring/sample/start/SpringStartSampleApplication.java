package com.zhoukekexi.spring.sample.start;

import com.zhoukekexi.spring.sample.start.service.StartSampleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhoukehh
 * @date 2023/7/6
 * @description
 */
@ComponentScan("com.zhoukekexi.spring.sample.**")
public class SpringStartSampleApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringStartSampleApplication.class);
		Object name = context.getBean("name");
		System.out.println(name);
		StartSampleService service = context.getBean(StartSampleService.class);
		service.sampleMethod();
	}
}
