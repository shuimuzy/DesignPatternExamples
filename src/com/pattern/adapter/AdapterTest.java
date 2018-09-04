package com.pattern.adapter;
/** 
* @Description:
* 这样Targetable接口的实现类就具有了Source类的功能。
* @author Simon
* @date 10 May 2018 
*/
public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}

}
