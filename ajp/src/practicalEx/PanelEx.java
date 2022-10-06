package practicalEx;

import java.awt.*;
import java.awt.event.*;

public class PanelEx extends Frame 
 {
	Panel pl;
	public PanelEx()
    {
	   setVisible(true);
	   setSize(500,500);
	   setLayout(null);
	   setTitle("PanelEx");
	    pl = new Panel();
	   pl.setBackground(Color.red);
	   pl.setBounds(100,100,300,200);
	   add(pl);
	   Button b = new Button("hey");
	   pl.add(b);
	   b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				   pl.setVisible(false);

			}
		});
    }

	public static void main(String[] args) 
    {
		new PanelEx();
	}

	}


