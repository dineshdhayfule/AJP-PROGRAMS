package ajp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialog_demo extends Frame 
{
	private static Dialog d ;
	dialog_demo()
	{
		setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
         d = new Dialog(new Frame(),"Dialog",true) ;
       d.setLayout(new FlowLayout());

        Button b = new Button("close");
		
        b.addActionListener(new ActionListener() 
        {
			public void actionPerformed(ActionEvent e) 
			{	
				dialog_demo.d.setVisible(false);
			}
		});
        d.add(b);
        d.setVisible(true);
        d.setSize(500,600);
	}
	
	public static void main(String[] args) 
	{
new dialog_demo();
	}

	
}
