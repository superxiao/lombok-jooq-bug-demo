package com.example;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoApplication {

	@Builder
	@Data
	static class Person {

		private String name;

		private int age;

	}

	public static void main(String[] args) {
		log.info("Person ${}", Person.builder().name("John").build().getName());
	}

}
