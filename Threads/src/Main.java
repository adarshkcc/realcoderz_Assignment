
class MyRunnable implements Runnable // runnable interface has only one method i.e run().
{
	public void run()
	{
		System.out.println("child thread1");
		System.out.println("child thread2");
		System.out.println("child thread3");
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyRunnable r=new MyRunnable();

Thread t=new Thread(r); // as we know  thread class is responsible for starting the thread
t.start();

 
Thread t1=new Thread(); // as we know thread class has empty run() and if we are not extending thread class then nothing will be printed
t1.start();


System.out.println("main thread1");
System.out.println("main thread2");
System.out.println("main thread1");
System.out.println("main thread2");
	}

}
