

class Table
{
	public synchronized void displayTable(int x) //if any thread start executing then until it finish their execution remaining threads has to wait. 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"*"+i+"="+(x*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class adarsh extends Thread
{
	Table t;
	public adarsh(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.displayTable(5);
	}
}
class raj extends Thread
{
	Table t;
	public raj(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.displayTable(10);
	}
}

public class Synchronize {

	public static void main(String[] args) {
		Table t=new Table();
		adarsh t1=new adarsh(t);
		raj t2=new raj(t);
		t1.start();
		
		t2.start();
		t1.run();

	}

}
