package com.pattern.proxy;
/** 
* @Description:
* @author Simon
* @date 10 May 2018 
*/
public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
