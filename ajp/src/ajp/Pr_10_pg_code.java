package ajp;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pr_10_pg_code extends Frame {

	public Pr_10_pg_code() 
	{
	 setVisible(true)	;
	 setSize(500,500);
	 setTitle("key Event");
	 setLayout(new FlowLayout());
	 TextField tf = new TextField(10);
	 add(tf);
	 Label lb = new Label("");
	 add(lb);
	 tf.addKeyListener(new KeyAdapter() {
		
		@Override
		public void keyPressed(KeyEvent e) 
		{
			lb.setText("key is pressed");
		}
		 
	 });
	}

	public static void main(String[] args) 
	{
		new Pr_10_pg_code();
	}

}
