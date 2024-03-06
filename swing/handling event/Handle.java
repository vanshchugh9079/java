import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

class Simple implements ActionListener {
    JLabel label;
    Simple() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        label = new JLabel();
        button.setBackground(Color.green);
        button.setBackground(null);
        LineBorder border=new LineBorder(Color.green);
        button.setBorder(border);
        button.setBounds(100, 20, 100, 40);
        label.setBounds(10, 100, 300, 20);
        button.addActionListener(this);
        frame.setSize(400, 300);
        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    // Implementing actionPerformed method
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("click me")) {
            label.setText("Button Clicked!");
        }
    }

}

class Handle {
    public static void main(String[] args) {
        new Simple();
    }
}
