/**
 * 
 */
package com.java.springboot.practice.helloworld;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author syamd
 *
 */
@Setter
@Getter
@ToString
public class HelloWorldBean {

	@SuppressWarnings("unused")
	private String message;

	/**
	 * 
	 */
	public HelloWorldBean(String message) {
		this.message = message;
	}
}
