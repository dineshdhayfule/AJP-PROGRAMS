import javax.swing.*;
import java.awt.event.*;
class pgbr extends JFrame
{
    JProgressBar jb;  
 	JButton b = new JButton("click");			 
    int i=0;
	pgbr()
	{
		setSize(250,150);
		setVisible(true);
		jb=new JProgressBar(1,100);    
		jb.setStringPainted(true);
		jb.setBounds(110,20,200,25);
		jb.setVisible(false);
		b.setBounds(150,80,80,25);
		add(jb);
		add(b);
		b.addActionListener(new ActionListener() 
		{
	     public void actionPerformed(ActionEvent ae)
		 { 
		 	if (ae.getSource()==b) {
		 		jb.setVisible(true);
		 		try{
		 			while(i<=1000)
		 			{
		 				Thread.sleep(50);
		 				jb.paintImmediately(0,0,200,50);
		 				jb.setValue(i);
		 				i+=10;
		 			}
		 		}catch(Exception ee){}	
		 	}
	     }
	    });
    }    
	    public static void main(String[] args)
		{
			new pgbr();			
		}
}