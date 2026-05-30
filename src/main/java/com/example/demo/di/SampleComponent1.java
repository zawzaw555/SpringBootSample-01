package com.example.demo.di;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Component("SampleComponent1")
@Slf4j
public class SampleComponent1 implements SampleComponent {
	private String str = "SampleComponent1";
	//private static final Logger log = LoggerFactory.getLogger(SampleComponent1.class);
	
	@Override
	public String getStr() {
		return this.str;
	}

	@PostConstruct
	public void init() {
		log.info(str + "init");
	}

	@PreDestroy
	public void preDestory() {
		log.info(str + "preDestory");
	}
}
