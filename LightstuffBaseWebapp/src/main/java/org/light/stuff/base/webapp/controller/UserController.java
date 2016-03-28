package org.light.stuff.base.webapp.controller;

import org.light.stuff.base.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable String id, @RequestParam(value="test", defaultValue="test") String test) {
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setUername("User Name");
		user.setEmail("user1@email.com");
		System.out.println("User: " + user);
		return user;
	}
}
