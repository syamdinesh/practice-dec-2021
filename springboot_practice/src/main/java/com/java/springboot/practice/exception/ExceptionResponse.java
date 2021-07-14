/**
 * 
 */
package com.java.springboot.practice.exception;

import java.util.Date;

import lombok.Getter;
import lombok.ToString;

/**
 * The Class ExceptionResponse.
 * 
 * @author syamd
 */
@Getter
@ToString
public class ExceptionResponse {

	/** The time stamp. */
	private Date timeStamp;

	/** The message. */
	private String message;

	/** The details. */
	private String details;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7630259398733023972L;

	/**
	 * Instantiates a new exception response.
	 *
	 * @param timeStamp the time stamp
	 * @param message   the message
	 * @param details   the details
	 */
	public ExceptionResponse(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}
}
