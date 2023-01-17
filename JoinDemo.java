package mythread;

public class JoinDemo extends Thread
{
    public void run()
    {
   try
   {
       System.out.println();
       Thread.currentThread().join();
   }
   catch(Exception e)
   {

   }
    }

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(Thread.currentThread().getName()+"started...");
        JoinDemo t1=new JoinDemo();
        t1.start();
        CharThread c=new CharThread();
        Thread t2=new Thread(c);
        //Thread t3=new Thread(c);
        t2.start();
        
        
        

    }

 

}