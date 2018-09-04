package com.pattern.builder;
/** 
* @Description:
* @author Simon
* @date 9 May 2018 
*/
public class MailSender implements Sender {
	
	public MailSender() {
		System.out.println("Create a new MailSender!");
	}

	@Override
	public void send() {
		System.out.println("This is a mail sender");
	}

}
