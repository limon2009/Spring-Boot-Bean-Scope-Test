package com.monirthought.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class SingletonBeanImpl implements SingletonBean {

	/* Prototype Bean autowired to observer prototype scope */
	@Autowired
	PrototypeBean prototypeBean;

	private static int created = 0;

	/**
	 * Each time this bean is initialized, 'created' increases by one.
	 */
	public SingletonBeanImpl() {
		super();
		System.out.println("*************************** Singleton Bean Created " + (++created)
				+ " Times ************************");
	}
}
