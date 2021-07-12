/**
 * 
 */
package com.java.springboot_practice.springboot_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author syamd
 *
 */
@RestController
public class HelloWorldController {

	/**
	 * get method to return hello world
	 */
	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		return "Hello World :- ";
	}

	/**
	 * get method to return hello world
	 */
	@GetMapping(path = "/hello-world-bean"/* produces = MediaType.APPLICATION_JSON_VALUE */)
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
}