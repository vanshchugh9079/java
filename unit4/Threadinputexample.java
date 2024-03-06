import java.util.Scanner;
class Cooking implements Runnable {
    public void run() {
     //   String s;
	//Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	//s=sc.next();
	
    }
}
class Chatting implements Runnable {
    public void run() {
        System.out.println("chatting thread");
    }
}

class Threadinputexample {
    public static void main(String args[]) {
        Cooking cook = new Cooking();
        Chatting chat = new Chatting();
        Thread t1 = new Thread(cook);
        Thread t2 = new Thread(chat);
        t1.start();
        t2.start();
    }
}
