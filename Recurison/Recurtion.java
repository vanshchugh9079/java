class Recurtion{
    static int recursive(int num){
        if(num<=1){
            int x=1;
            return x;
        }
        else{
            return num*recursive(num-1);
        }
    }
    public static void main(String[] args) {
        // Recurtion rec=new Recurtion();
        System.out.println(recursive(5));
    }
}