/**
 * 
 */
package com.java.springboot.practice.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.java.springboot.practice.exception.UserNotFoundException;

/**
 * @author syamd
 *
 */
@Component
public class UserDaoService {

	private static List<User> usersList = new ArrayList<>();

	private static int usersCount = 3;

	static {
		usersList.add(new User(1, "Syam", new Date()));
		usersList.add(new User(2, "Dinesh", new Date()));
		usersList.add(new User(3, "Bayyana", new Date()));
	}

	public List<String> userDaoService(boolean flag) {
		if (flag == true) {
			return Arrays.asList("Syam", "Dinesh", "Bayyana");
		} else {
			throw new UserNotFoundException("flag " + flag);
		}
	}

	public List<User> findAll() {
		return usersList;
	}

	public User save(User userObject) {
		if (userObject.getId() == null) {
			userObject.setId(++usersCount);
		}
		usersList.add(userObject);
		return userObject;
	}

	public List<User> findOne(int id) {
		return usersList.stream().filter(s -> s.getId() == id).collect(Collectors.toList());
	}

	public List<User> deleteOne(int id) {
		if (usersList.removeIf(s -> s.getId() == id)) {
			return usersList;
		}
		return null;
	}
}
