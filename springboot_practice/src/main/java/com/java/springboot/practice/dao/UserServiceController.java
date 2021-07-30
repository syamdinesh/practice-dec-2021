/**
 * 
 */
package com.java.springboot.practice.dao;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.practice.exception.UserNotFoundException;

/**
 * @author syamd
 *
 */
@RestController
public class UserServiceController {

	@Autowired
	private UserDaoService UserDaoService;

	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return UserDaoService.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public List<User> retrieveUser(@PathVariable int id) {
		List<User> userList = UserDaoService.findOne(id);
		if (userList == null) {
			throw new UserNotFoundException("Requested id:- " + id);
		}
		return userList;
	}

	// input- Details of user
	// output- Created and return the created URI
	@PostMapping(path = "/users")
	public User createUser(@Valid @RequestBody User user) {
		User save = UserDaoService.save(user);
//		URI locationURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(save.getId())
//				.toUri();
//		return ResponseEntity.created(locationURI).build();
		return save;
	}

	@DeleteMapping(path = "/user-delete/{id}")
	public List<User> deleteUser(@PathVariable int id) {
		List<User> user = UserDaoService.deleteOne(id);
		if (user == null) {
			throw new UserNotFoundException("Requested id:- " + id);
		}
		return user;
	}
}
