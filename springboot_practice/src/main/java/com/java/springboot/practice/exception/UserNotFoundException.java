/**
 * 
 */
package com.java.springboot.practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author syamd
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3155040033456801623L;

	/**
	 * @param message
	 */
	public UserNotFoundException(String message) {
		super(message);
	}
}
