class MyThread extends Thread
{
	public void run() {
	System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		System.out.println(t.getName()); // name of thread=Thread-0
		
		//t.run(); // name of thread=main
	
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Adarsh");
		System.out.println(Thread.currentThread().getName());
	//	t.run();
	}

}
