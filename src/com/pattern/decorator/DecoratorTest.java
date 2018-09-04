package com.pattern.decorator;
/** 
* @Description:
* @author Simon
* @date 10 May 2018 
*/
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable obj = new Decrator(new Source());
		obj.method();
	}

}
