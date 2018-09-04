package com.pattern.builder;
/** 
* @Description:
* @author Simon
* @date 9 May 2018 
*/
public class BuilderTest {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
