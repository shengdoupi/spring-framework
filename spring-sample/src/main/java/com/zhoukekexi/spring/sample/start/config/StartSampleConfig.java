package com.zhoukekexi.spring.sample.start.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author zhoukehh
 * @date 2023/7/6
 * @description
 */
@Component
public class StartSampleConfig {
	@Bean
	public String name() {
		return "Hello world!";
	}
}
