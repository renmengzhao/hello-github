package com.ren.singleton;

import com.ren.abstractfactory.entity.Animal;

public class Triger extends Animal{

	private static Triger triger = null;
	
	// ˫��У�鱣�ָ����ܣ����ұ�֤�����غ��̰߳�ȫ
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
	
	// ͨ������ػ���ʵ�ֻ�ȡʵ����������
	public static Triger getInstanceFromBuilder() {
		return TrigerBuiler.terger;
	}
	
	@Override
	public String love() {		
		return "Ψһ���ϻ����ȥ��";
	}

	@Override
	public String eat() {		
		return "�ϻ����Դ�����";
	}

}
