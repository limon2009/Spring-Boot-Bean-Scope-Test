package com.monirthought.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * A spring bean with scope "session"
 * 
 * @author Moniruzzaman Md
 *
 */
@Repository
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionBeanImpl implements SessionBean {

	/* Singleton Bean autowired to observer session scope */
	@Autowired
	SingletonBean singletonBean;

	/* Prototype Bean autowired to observer prototype scope */
	@Autowired
	PrototypeBean prototypeBean;

	private static int created = 0;

	/**
	 * Each time this bean is initialized, 'created' increases by one.
	 */
	public SessionBeanImpl() {
		System.out.println("**************** Session Bean Created " + (++created) + " Times ****************");
	}

	public void printMessage() {
		System.out.println("********************** Session Bean - PrintMessage Method Called ******************");
	}
}
