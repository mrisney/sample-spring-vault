package com.mwa.vault.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner {

	@Value("${foo}")
	String foo;

	@Value("${baz}")
	String bar;

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class)
			.logStartupInfo(false)
			.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Foo: " + foo);
		log.info("Bar: " + bar);
	}
}
