package mythread;

public class ThreadDemo implements Runnable 
{
	String[] cust={"raghu","srav","sou","pranav"};
	public void run()
	{
		String[] cust={"raghu","srav","sou","pranav"};
	
		for(int i=0;i<=cust.length-1;i++)
		{
			System.out.println(cust[i]);
		}
			try
			{
				Thread.sleep(2000);
				Thread t=Thread.currentThread();
				System.out.println(t.getName());
			}
		catch(InterruptedException e)
		{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td=new ThreadDemo();
		Thread t1=new Thread(td);
		Thread t2=new Thread(td);
		t1.start();
		t2.start();

	}

}
