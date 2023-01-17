package mythread;

public class SimpleIntrest extends Thread {
	public void details(float prin,float rate,float time)
	{
		float SI=(prin*rate*time/100);
		System.out.println(SI);
	}

	public void run(){
	details(200.0f,2.0f,3.0f);
	
	}

}
