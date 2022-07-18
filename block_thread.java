package sample;
import java.lang.*;
class message
{
	public void show(String name)
	{	
		try {
		for(int i=1;i<=3;i++)
		{
			System.out.println("Heyyy "+ name);
			Thread.sleep(2000);
		}
	    synchronized(this) 
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("How are You "+name);
				Thread.sleep(2000);
			}
		}
		for(int i=1;i<=3;i++)
	     	{
			System.out.println("Byee "+ name);
			Thread.sleep(2000);
		    }
		}
		catch(Exception ex) {	
		}
	}
}
class thread extends Thread
{
	message obj;
	String name ;
	thread(message obj, String name)
	{
		this.obj= obj;
		this.name = name;
	}
	public void run()
	{
		obj.show(name);
	}
}
public class block_thread {
	public static void main(String[] args) {
		message msg = new message();
		thread thr1 = new thread(msg,"Ashish");
		thread thr2 = new thread(msg,"Onkar");
		thr1.start();
		thr2.start();		
	}

}
