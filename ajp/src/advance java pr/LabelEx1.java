
import java.awt.*;

import javax.swing.*;

public class LabelEx1 extends JApplet {

	public  void start() 
	{
		setSize(500,500);
		setLayout(new FlowLayout());
		JLabel lb = new JLabel("first Applet");
		add(lb);
		ImageIcon i = new ImageIcon("C:/Users/Prerana Dhayfule/Downloads/icon.jpg");
		JLabel lb1 = new JLabel(i);
		add(lb1);
	}

}

