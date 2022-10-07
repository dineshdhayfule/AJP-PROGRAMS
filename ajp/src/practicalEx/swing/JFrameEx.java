package practicalEx.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class JFrameEx extends JFrame {

	public JFrameEx() 
	{
		Container c= getContentPane();
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new JFrameEx();
	}

}
