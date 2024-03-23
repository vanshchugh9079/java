import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test {
    Test() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JLabel label2 = new JLabel("label2");
        Choice choice = new Choice();
        label.setSize(100,100);
        JList list = new JList();
        list.add(label2);
        list.setBounds(300,500,100,100);
        choice.addItem("1");
        choice.addItem("2");
        choice.addItem("3");
        choice.addItem("4");
        choice.addItem("5");

        // Define the item listener
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText(choice.getSelectedItem());
            }
        });
        frame.add(list);
        frame.add(choice);
        frame.add(label);
        // Set layout to null since you're using absolute positioning
        frame.setLayout(null);

        // Set component bounds
        choice.setBounds(50, 50, 100, 100);
        label.setBounds(100, 200, 100, 50);

        // Set background colors
        frame.setBackground(Color.orange);
        choice.setBackground(Color.pink);

        // Set frame properties
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Control {
    public static void main(String[] args) {
        new Test();
    }
}
