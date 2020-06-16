package com.ren.singleton;

import com.ren.abstractfactory.entity.Animal;

public class Triger extends Animal{

	private static Triger triger = null;
	
	// 双重校验保持高性能，并且保证懒加载和线程安全
	public static Triger getInstance() {
		if(triger == null) {
			synchronized (Triger.class) {
				if(triger == null) {
					System.out.println(Thread.currentThread().getName());
					triger = new Triger();							
				}
			}
		}
		return triger;
	}
	
	private Triger() {}
	
	private static class TrigerBuiler {
		private static final Triger terger = new Triger();
	}
	
	// 通过类加载机制实现获取实例和懒加载
	public static Triger getInstanceFromBuilder() {
		return TrigerBuiler.terger;
	}
	
	@Override
	public String love() {		
		return "唯一的老虎如何去爱";
	}

	@Override
	public String eat() {		
		return "老虎爱吃大米呐";
	}

}
