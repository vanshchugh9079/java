class Cokking extends Thread
{
     public void run()
     {
	while(true)
	{
	    System.out.println("cokking thread");
	}
	
     }
}
class Chating extends Thread
{
     public void run()
     {
	while(true)
	{
	    System.out.println("chating2 thread");	
	}
	
     }
}
class Mythread
{
     public static void main(String args[])
     {
	Cokking cook=new Cokking();
	Chating chat=new Chating();
	cook.start();
	chat.start();
     }
}