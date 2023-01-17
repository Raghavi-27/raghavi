package mythread;

public class MultipleThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails cd=new CustomerDetails();
		SimpleIntrest sim=new SimpleIntrest();
		cd.start();
		sim.start();

	}

}
