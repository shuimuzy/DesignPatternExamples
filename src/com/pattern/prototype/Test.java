package com.pattern.prototype;

import java.io.IOException;

/** 
* @Description:
* @author Simon
* @date 9 May 2018 
*/
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype prototype = new Prototype();
		prototype.setBase(1);
		prototype.setObj(new Integer(2));
		 /* 浅复制 */
		Prototype prototype1 = (Prototype) prototype.clone();
		
		/* 深复制 */
		Prototype prototype2 = (Prototype) prototype.deepClone();
		
		System.out.println(prototype1.getObj() == prototype.getObj());
		System.out.println(prototype1.getObj() == prototype2.getObj());
	}

}
