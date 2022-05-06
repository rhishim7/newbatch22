package com.zensar.thread;

public class Greeting {
	
	
	public synchronized void greet(String name) 
	{
		//if 150 lines of code is there
		//and 5 lines are inconsistent
		// then we use synchronized block
		
		synchronized (this) {
			//remaining 5 lines which are inconsistent
		}
		
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello! "+name);
		}
	}
	
	

}
