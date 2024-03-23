class share {
    int x = 5;
}

class thread1 extends Thread {
    public void run() {
        System.out.println("t1"+new share().x);
        int x = new share().x;
        x++;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new share().x = x;
        System.out.println("t1  "+new share().x);
    }
}

class thread2 extends Thread {
    public void run() {
        System.out.println("t2 "+new share().x);
        int y = new share().x;
        y--;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new share().x = y;
        System.out.println("t2 "+new share().x);
    }
}

class Syncronize {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
