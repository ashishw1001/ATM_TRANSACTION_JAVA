package sample;
import java.lang.*;
class Table implements Runnable{
	
	int num;
	 
	Table(int num)
	{
		this.num=num;
	}
	
	public  void run()
	{   
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<11 ; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
	}
}
class q2 {
	public static void main(String args[]) throws Exception{
		Table t1=new Table(5);
		Table t2=new Table(7);
		
		Thread tab1=new Thread(t1);
		Thread tab2=new Thread(t2);
		
		tab1.setName("table of 5");
		tab2.setName("table of 7");
		
		tab1.start();
		tab2.start();
	
	}
}
