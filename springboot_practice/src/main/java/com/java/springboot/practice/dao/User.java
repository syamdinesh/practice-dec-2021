/**
 * 
 */
package com.java.springboot.practice.dao;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.ToString;

/**
 * The Class User.
 *
 * @author syamd
 */
@ToString
public class User {

	/** The id. */
	private Integer id;

	/** The name. */
	@Size(min = 2)
	private String name;

	/** The birth date. */
	@Past
	private Date birthDate;

	/**
	 * Instantiates a new user.
	 *
	 * @param id the id
	 * @param name the name
	 * @param birthDate the birth date
	 */
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the birth date.
	 *
	 * @return the birth date
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the birth date.
	 *
	 * @param birthDate the new birth date
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
