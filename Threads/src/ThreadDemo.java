
class MyThread2 extends Thread 
{ 
    MyThread2() {} 
    MyThread2(Runnable r) {super(r); } 
    public void run() 
    { 
        System.out.print("Inside Thread ");
    } 
} 
class RunnableDemo implements Runnable 
{ 
    public void run() 
    { 
        System.out.print(" Inside Runnable"); 
    } 
} 
class ThreadDemo 
{  
    public static void main(String[] args) 
    { 
        new MyThread2().start(); 
        new MyThread2(new RunnableDemo()).start();  // run method of MyThread2 will be invoke.
    } 
} 