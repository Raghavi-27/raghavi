package mythread;

public class CustomerDetails extends Thread {

	public void getDetails(String name,String address)
	{
		System.out.println("name:"+name);
		System.out.println("address:"+address);
		
	}
	public void run()
	{
		getDetails("raghavi","b4");
	}
	

}
