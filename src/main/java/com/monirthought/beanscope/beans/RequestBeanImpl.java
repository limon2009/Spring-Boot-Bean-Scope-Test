package com.monirthought.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestBeanImpl implements RequestBean {

	private static int created = 0;

	/* Prototype Bean autowired to observer prototype scope */
	@Autowired
	PrototypeBean prototypeBean;

	/**
	 * Each time this bean is initialized, 'created' increases by one.
	 */
	public RequestBeanImpl() {
		System.out.println("*************************** Request Bean Created " + (++created)
				+ " Times *****************************");
	}

	public void printMessage() {
		System.out.println("********************** Request Bean - PrintMessage Method Called ******************");
	}
}
