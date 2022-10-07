package practicalEx.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class JFrameEx1  {

	public JFrameEx1() 
	{
		JFrame jf = new JFrame("secon frame");
		Container c= jf.getContentPane();
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new JFrameEx1();
	}

}
