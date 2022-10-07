package practicalEx.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class JLabelEx extends JFrame {

	public JLabelEx() 
	{
		Container c= getContentPane();
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lb = new JLabel("first JLabelEx");
		add(lb);
		ImageIcon i = new ImageIcon("C:/Users/Prerana Dhayfule/Downloads/icon.jpg");
		ImageIcon ii = new ImageIcon("C:/Users/Prerana Dhayfule/Downloads/dp.jpg");
		JLabel lb1 = new JLabel(ii);
		add(lb1);
		JLabel lb2 = new JLabel("Second JLabelEx",i,JLabel.RIGHT);
		add(lb2);
	}

	public static void main(String[] args) 
	{
		new JLabelEx();
	}

}
