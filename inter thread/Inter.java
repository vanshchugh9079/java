class Thread1 extends Thread{
    int x=0;
    public synchronized void increment(){

    }
    public void run(){
        for(int i=0;i<100;i++){
            x++;
        }
    }
}
class Inter{
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        t.start();
        System.out.println(t.x);

    }
}