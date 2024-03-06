// class custom extends Exception{
//     @Override
//     public String toString(){
//         return "erron in string";
//     }
//     @Override
//     public String getMessage(){
//         return "erron in message";
//     }
// }
import java.util.Scanner;
class DivideZerro extends Exception{
    @Override
    public String toString(){
        return "dvide by zeo is not possible";
    }
}
class Customex {
    public static void main(String[] args) {
        
        try{
            // throw new custom();
        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();//this is used to check error in which line
            System.out.println(e.getMessage());
        }
    }
}