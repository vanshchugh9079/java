class stat{
     static String myclass="stat";
     int age=100;
     static void game(){
        System.out.println(stat.myclass);
     }
}
class Main{
    public static void main(String[] args) {
        // stat s=new stat();
       System.out.println(stat.myclass);
        stat.game();
    }
}