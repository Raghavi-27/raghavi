package mythread;

public class MyThread extends Thread
{
	public void run()
	{
		try{
			for(int i=0;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.start();

	}

}
