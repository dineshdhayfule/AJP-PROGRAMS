import java.awt.*;
import java.awt.event.*;


public class panel extends Frame
{
	public static void main(String ar[])
	{

	panel p = new panel();
	p.setBackground(Color.black);
	p.setLayout(null);
	p.setVisible(true);
	p.setSize(500,500);

	Panel pl = new Panel();
	pl.setBounds(340,130,500,500);
	pl.setBackground(Color.white);
	p.add(pl);
	pl.setVisible(false);

	Button b = new Button("on");
	b.setBounds(200,200,50,30);
	b.setBackground(Color.white);
	
	p.add(b);

	Label l = new Label("panel");
	pl.add(l);

	Button b1 = new Button("off");
	b1.setBounds(260,200,50,30);
	b1.setBackground(Color.white);
	b1.setVisible(true);
	p.add(b1);
    b.addActionListener(new ActionListener() 
	   {
		  public void actionPerformed(ActionEvent e) 
		   {
			pl.setVisible(true);
		    b1.setVisible(true);
			
		   }
	    });
    b1.addActionListener(new ActionListener() 
	    {
		  public void actionPerformed(ActionEvent e) 
			{
				pl.setVisible(false);
			}
	    });
	}
} 