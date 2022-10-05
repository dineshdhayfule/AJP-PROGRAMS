import javax.swing.*;
class pgbr1 extends JFrame
{
    JProgressBar jb;  
    int i=0;
	pgbr1()
	{
		setSize(250,150);
		setVisible(true);
		jb=new JProgressBar(1,100);    
		jb.setStringPainted(true);
		jb.setBounds(110,20,200,25);
		add(jb);
    }    
    public void it(){
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
	    public static void main(String[] args)
		{
			pgbr1 p=new pgbr1();	
			p.it();		
		}
}