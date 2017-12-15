package com.monirthought.beanscope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monirthought.beanscope.beans.PrototypeBean;
import com.monirthought.beanscope.beans.RequestBean;
import com.monirthought.beanscope.beans.SessionBean;
import com.monirthought.beanscope.beans.SingletonBean;

/**
 * Simple Rest Controller to execute our test
 * 
 * @author Moniruzzaman Md
 *
 */
@RestController
public class HelloController {

	public HelloController() {
		System.out.println("***************HelloController initialized******************");
	}

	@Autowired
	PrototypeBean prototypeBean;

	@Autowired
	SessionBean sessionBean;

	@Autowired
	RequestBean requestBean;

	@Autowired
	SingletonBean singletonBean;

	@RequestMapping("/")
	public String index() {
		sessionBean.printMessage();
		requestBean.printMessage();
		return "Greetings from Spring Boot!";
	}

}
