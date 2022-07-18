package sample;
import java.lang.*;
class Bus implements Runnable{
	
	int available=5;
	int seat;
	Bus(int seat)
	{
		this.seat=seat;
	}
	
	public synchronized void run()
	{
		String name=Thread.currentThread().getName();
		if(available>=seat)
		{
		System.out.println("Hello "+ name+ " Your seat is booked. Thank you for booking");
		available=available-seat;
		}
		else
		{
			System.out.println("Sorry " +name+ " seat is not available");
		}
	}
}

public class Main {
	public static void main(String args[]) throws Exception{
		Bus b1=new Bus(1);	
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(b1);
		
		t1.setName("Atharva");
		t2.setName("Kshitij");
		t3.setName("Ashish");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
