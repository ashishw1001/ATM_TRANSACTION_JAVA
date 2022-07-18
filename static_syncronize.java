package sample;

class Bank extends Thread{
	
  static  int available=15000;
   static int bal;
   Bank(int bal)
	{
		this.bal=bal;
	}
	
 public  static synchronized void wid()
	{
		String name=Thread.currentThread().getName();
		if(available>=bal)
		{
		 System.out.println("Hello "+ name+ " You Widraw "+ bal+" Successfully.");
		  available=available-bal;
		}
		else
		{
			System.out.println("Sorry " +name+ " We've Insufficiant Fund.");
		}
	}
 public void run() {
	 wid();
 }
}



public class static_syncronize{
	public static void main(String args[]) throws Exception{
		Bank b1=new Bank(5000);	
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
	  
		Bank b2=new Bank(5000);
		Thread t3=new Thread(b2);
		Thread t4=new Thread(b2);
		
		t1.setName("Abhishekh");
		t2.setName("Chinmay");
		
		t3.setName("Ashish");
		t4.setName("Prashik");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

