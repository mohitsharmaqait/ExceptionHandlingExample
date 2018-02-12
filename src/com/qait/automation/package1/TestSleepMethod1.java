package com.qait.automation.package1;

public class TestSleepMethod1 extends Thread{

	public static void main(String[] args) {
		TestSleepMethod1 t1=new TestSleepMethod1();  
		TestSleepMethod1 t2=new TestSleepMethod1();     
  		t1.start();  
  		t2.start();  

		// TODO Auto-generated method stub

	}

	public void run(){
		for(int i=1;i<4;i++){  
			try{
				Thread.sleep(500);
				System.out.println("in try block");
				}
			catch(InterruptedException e){
				System.out.println(e);
				System.out.println("in catch block");
				}  
			System.out.println(i);  
		}  

	}
}
