package com.pattern.proxy;
/** 
* @Description:
* @author Simon
* @date 10 May 2018 
*/
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}

}
