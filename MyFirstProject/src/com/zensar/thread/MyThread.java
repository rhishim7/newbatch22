package com.zensar.thread;

public class MyThread extends Thread {

	public void run()
	{
		if(Thread.currentThread().getName()=="t1")
		{
			for(int i=0;i<=10;i++)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Ram");
			}
		}
		else if(Thread.currentThread().getName()=="t2")
		{
			for(int i=0;i<=10;i++)
			{
				try {
					Thread.currentThread().sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Seeta");
			}
		}
		
	}
}
