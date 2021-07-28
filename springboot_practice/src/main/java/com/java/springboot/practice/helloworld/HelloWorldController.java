/**
 * 
 */
package com.java.springboot.practice.helloworld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.practice.dao.UserDaoService;

/**
 * @author syamd
 *
 */
@RestController
public class HelloWorldController {

	@Autowired
	private UserDaoService userDao;

	@Autowired
	private MessageSource messageSource;

	/**
	 * get method to return hello world
	 */
	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		return "Hello World :- ";
	}

	/**
	 * get method bean example
	 */
	@GetMapping(path = "/hello-world-bean") /**/
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	/**
	 * get method path_parameter example
	 */
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean HelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
	}

	/**
	 * get method path_parameter example
	 */
	@GetMapping(path = "/user-bean/path-variable/{flag}")
	public List<String> userBean(@PathVariable boolean flag) {
		return userDao.userDaoService(flag);
	}

	@GetMapping(path = "/internationalized")
	public String helloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

}
