package com.qait.automation.package1;

public class ThreadExample1 implements Runnable{  
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			ThreadExample1 t1=new ThreadExample1(); 
			Thread t2 = new Thread(t1);
		t2.start();  
		 		}  


}
