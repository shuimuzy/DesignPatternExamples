package com.pattern.decorator;
/** 
* @Description:
* @author Simon
* @date 10 May 2018 
*/
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("The original method!");
	}

}
