class Cooking implements Runnable {
    public void run() {
        while (true) {
            System.out.println("cooking thread");
        }
    }
}

class Chatting implements Runnable {
    public void run() {
        while (true) {
            System.out.println("chatting thread");
        }
    }
}

class MyRunnableThread {
    public static void main(String args[]) {
        Cooking cook = new Cooking();
        Chatting chat = new Chatting();
        Thread t1 = new Thread(cook);
        Thread t2 = new Thread(chat);
        t1.start();
        t2.start();
    }
}
