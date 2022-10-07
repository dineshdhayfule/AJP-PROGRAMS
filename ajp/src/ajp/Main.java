package ajp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import java.net.*;

public class Main extends JFrame{
   Main() {
  Container c = getContentPane();
        setVisible(true);
        setLayout(null);
        setSize(500, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.CYAN);

        JButton b1 = new JButton("Encoder");
        JButton b2 = new JButton("Decoder");
        b1.setVisible(true);
        b2.setVisible(true);
        b1.setBounds(150, 150, 170, 30);
        b2.setBounds(150, 200, 170, 30);
        add(b1);
        add(b2);

        JPanel jp = new JPanel();
        jp.setVisible(false);
        jp.setBounds(0, 0, 500, 360);
        jp.setBackground(Color.red);
        add(jp);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jp.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jp.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
