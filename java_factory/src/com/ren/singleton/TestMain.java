package com.ren.singleton;

import com.ren.abstractfactory.entity.Animal;

public class TestMain {

	public static void main(String[] args) {
				
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {					
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				Animal triger = Triger.getInstance();		
				System.out.println(triger.getAge() + "" +triger.eat());				
			}
		}).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {					
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				Animal triger = Triger.getInstance();		
				System.out.println(triger.getAge() + "" +triger.eat());				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {					
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				Animal triger = Triger.getInstance();		
				System.out.println(triger.getAge() + "" +triger.eat());	
				
			}
		}).start();
		
		System.out.println(Singleton.INSTANCE.eat());		
	}
}
