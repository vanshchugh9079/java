import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Event {
    Event() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        JLabel label = new JLabel();
        button.setBackground(Color.green);
        label.setText("hello  my name is vansh");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("hello  my name is vansh");
            }
        });
        label.setBounds(200, 100, 50, 50);
        button.setBounds(100,100,100,100);
        frame.add(label);
        frame.add(button);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Click {
    public static void main(String[] args) {
        new Event();
    }
}
