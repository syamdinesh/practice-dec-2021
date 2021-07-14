/**
 * 
 */
package com.java.springboot.practice.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.java.springboot.practice.exception.UserNotFoundException;

/**
 * @author syamd
 *
 */
@Component
public class UserDAO {

	private List<String> list;

	/**
	 * 
	 */
	public UserDAO() {

	}

	public List<String> userDaoService(boolean flag) {
		if (flag == true) {
			return Arrays.asList("Syam", "Dinesh", "Bayyana");
		} else {
			throw new UserNotFoundException("flag " + flag);
		}
	}

}
