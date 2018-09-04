package com.pattern.builder;
/** 
* @Description:
* @author Simon
* @date 9 May 2018 
*/
public class SmsSender implements Sender {
	
	public SmsSender() {
		System.out.println("Create a new SmsSender!");
	}

	@Override
	public void send() {
		System.out.println("This is a sms sender!");
	}

}
