


public class Sample  extends Thread   //light weight component which performs unit of work
{

	public  void run()
	{
		for(int i=0;i<=10;i++) {
			//currentThread();
			System.out.println(i+"   "+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Sample obj=new Sample();
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		System.out.println(obj.getState());
		System.out.println(obj.isAlive());
		System.out.println(obj.getPriority());
	
		obj.setName("adarsh thread");
		System.out.println(obj.getName());
		
		obj.setPriority(8);
		System.out.println(obj.getPriority());
		
		
		System.out.println(obj.isAlive());
		
		obj.start();    // it will call predefined run method 
		
//		try {
//			obj.join();
//			
//		}
//		catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
		
		System.out.println(obj.isAlive());
		System.out.println(obj.getState());
		
		Sample o=new Sample();
		o.setName("raj ");
		o.start();
		
		
	}

}
