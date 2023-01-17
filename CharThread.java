package mythread;

public class CharThread extends Thread {
	public void  run()
	{
		try
		{
		for(char i=65;i<=90;i++)
		{
			System.out.print(i);
		}
		Thread.currentThread().join();
       }
		catch(Exception e)
		{
	
		}
	}
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread());

		CharThread t1=new CharThread();
		t1.start();
	}

}