package ajp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class tfg {
private static void createAndShowGUI() {
JFrame jFrame = new JFrame("ENCODER");
jFrame.setVisible(true);
jFrame.setLayout(null);
jFrame.setSize(500, 360);
jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel p = new JPanel();
p.setBackground(Color.red);
jFrame.add(p);
p.setVisible(false);
p.setBounds(100, 100, 300, 250);
JButton b1 = new JButton("off panel");
JButton b2 = new JButton("add label");
b1.setBounds(10, 20, 120, 30);
b2.setBounds(150, 20, 100, 30);
p.add(b1);
p.add(b2);
JButton b = new JButton("this is b");
b.setBounds(50, 50, 150, 50);
b.setVisible(true);
jFrame.add(b);
JLabel lb = new JLabel("new");
// lb.setSize(100,110);
lb.setBounds(20, 50, 30, 50);
lb.setVisible(false);

p.setLayout(null);
p.add(lb);

b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

b.setVisible(false);
p.setVisible(true);
lb.setVisible(false);
}
});
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

b.setVisible(true);
p.setVisible(false);
}
});
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
lb.setVisible(true);

}
});

}

public static void main(String[] args) {
createAndShowGUI();
}
}
