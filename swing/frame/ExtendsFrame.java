import javax.swing.*;
class mywindow extends JFrame {
    mywindow(){
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class ExtendsFrame {
   public static void main(String[] args){
    new mywindow();
   }
}
