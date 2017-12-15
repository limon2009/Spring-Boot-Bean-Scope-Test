package com.monirthought.beanscope.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * A spring bean with scope "prototpe"
 * 
 * @author Moniruzzaman Md
 *
 */
@Component
@Scope("prototype")
public class PrototypeBeanImpl implements PrototypeBean {

	private static int created = 0;

	/**
	 * Each time this bean is initialized, 'created' increases by one.
	 */
	public PrototypeBeanImpl() {
		System.out.println(
				"************************** Prototype Bean Created " + (++created) + " Times ************************");
	}

}
