package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moon.utils.BaseController;
import com.moon.entity.User;
import com.moon.service.UserService;

@Controller
@RequestMapping("/moon/User")
public class UserController extends BaseController {
	@Autowired
	private UserService userService;

}