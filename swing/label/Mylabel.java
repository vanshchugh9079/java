import javax.swing.*;
class upper{
    upper(){
        JFrame frame=new JFrame();
        JLabel l1=new JLabel("first label");
        JLabel l2=new JLabel("second label");
        l1.setBounds(100,100,100,100);
        l2.setBounds(100,200,100,100);
        frame.add(l1);
        frame.add(l2);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
class Mylabel{
    public static void main(String[] args){
        new upper();
    }
}