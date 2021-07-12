/**
 * 
 */
package com.java.springboot_practice.springboot_practice;

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

	private String message;

	/**
	 * 
	 */
	public HelloWorldBean(String message) {
		this.message = message;
	}
}
