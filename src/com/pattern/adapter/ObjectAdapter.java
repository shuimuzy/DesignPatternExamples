package com.pattern.adapter;
/** 
* @Description:
* 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
* 而是持有Source类的实例，以达到解决兼容性的问题。
* @author Simon
* @date 10 May 2018 
*/
public class ObjectAdapter implements Targetable {
	
	private Source source;
	
	public ObjectAdapter(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("This is the targetable method!");
	}

}
