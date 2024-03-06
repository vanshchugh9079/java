class Study extends Thread {
    public void run() {
        while(true)
        System.out.println("i am a styying");
    }
}

class playing extends Thread {
    public void run() {
        while(true)
        System.out.println("i am a playing");
    }
}

class sleeping extends Thread {
    public void run() {
        while(true)
        System.out.println("i am a sleeping");
    }
}

class Priorty {
    public static void main(String[] args) {
        Study t1 = new Study();
        playing t2 = new playing();
        sleeping t3 = new sleeping();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t1.getPriority());
        // t1.start();
        // t2.start();
        // t3.start();
    }
}