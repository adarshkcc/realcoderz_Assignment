class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread");
		}
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		
		// priority range is 1-10  where 1-min priority 10-max priority
		
		// if we try to set priority out of range then an Illegal Argument Exception will be thrown.
		
		System.out.println(Thread.currentThread().getPriority()); // for main thread default priority is 5

		MyThread1 t=new MyThread1();
		
		System.out.println(t.getPriority()); //for other than main thread priority is inherited from parent thread to child
         
		// parent thread is main thread.
		
		// now lets set the priority of main thread
		
		Thread.currentThread().setPriority(8);
		
		System.out.println(Thread.currentThread().getPriority()); //8
		System.out.println(t.getPriority()); //5
	
		MyThread1 t1=new MyThread1();
		System.out.println(t1.getPriority()); //8
		
		// now  main thread priority is 8 and let set the child thread priority to 10.
		
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		t1.start();
		
		// now in this case child thread will execute first then main will be executed because of priority difference.
		for(int i=0;i<5;i++)
		{
			System.out.println("main-thread");
		}
		// we might won't get proper output coz some platform won't provide thread priority.
	}
	

}
