package ajp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class pgbr extends JFrame
{ 				 
JProgressBar jb;    
int i=0,num=0;    
		pgbr()
		{
				 jb=new JProgressBar(0,2000);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);    
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);     
JButton btnNewButton = new JButton("New button");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		iterate();
	
	}
});
btnNewButton.setBounds(268, 395, 85, 21);
add(btnNewButton);
}    
public void iterate(){    
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(150);}catch(Exception e){}    
}    
}    
			public static void main(String[] args)
			{
				pgbr v=new pgbr();
//				v.iterate();
				v.setVisible(true);
			}
}