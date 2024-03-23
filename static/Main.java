class stat{
     static String myclass="stat";
     int age=100;
     final static void game(){
        System.out.println(myclass);
        System.out.println(new stat().age);
     }
     void p(){
        System.out.println(age);
     }
}
class Main{
    public static void main(String[] args) {
        // stat s=new stat();
        stat.myclass="hello";
        System.out.println(stat.myclass);
       System.out.println(stat.myclass);
       stat.game();
    }
}