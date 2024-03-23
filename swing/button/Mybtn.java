import javax.swing.*;
class Mybtn {
   public static void main(String args[])
   {
	JFrame frame=new JFrame();
	JButton button1=new JButton("hello");
	frame.setSize(500,500);
	frame.setTitle("my name is vansh");
    // button1.setText("my name is vansh");
    button1.setBounds(100,100,100,25);
    frame.add(button1);
	frame.setLayout(null);
	frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
}
