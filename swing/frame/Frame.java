package frame;
import javax.swing.*;
class mywindow{
    mywindow(){
        JFrame frame=new JFrame();
        frame.setTitle("first frame in java");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
class Frame{
    public static void main(String[] args){
        new mywindow();
    }
}