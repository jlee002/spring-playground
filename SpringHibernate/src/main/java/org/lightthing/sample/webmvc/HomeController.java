package org.lightthing.sample.webmvc;

import java.util.List;

import org.lightthing.sample.webmvc.dao.UserDAO;
import org.lightthing.sample.webmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		List<User> listUser = userDao.list();
		ModelAndView model = new ModelAndView("home");
		model.addObject("userList", listUser);
		return model;
	}
}
