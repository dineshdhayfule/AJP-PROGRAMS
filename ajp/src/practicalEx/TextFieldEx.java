package practicalEx;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldEx extends Frame implements ActionListener
{
	TextField tf,tf1,tf2,tf3;
	public TextFieldEx()
	{
      setVisible(true);
      setSize(500,500);
      setLayout(new FlowLayout());
      tf = new TextField("dinesh",10);
      tf1 = new TextField();
      tf1.setEchoChar('*');
      tf2 = new TextField(10);
      tf3 = new TextField("dhayfule");
      add(tf1);
      add(tf);
      add(tf3);
      add(tf2);
      Button b = new Button("submit");
      add(b);
      b.addActionListener(this);
      
	}
	public void actionPerformed(ActionEvent e) {
	      System.out.print(tf.getText()+"\t");
	      System.out.println(tf3.getText()+"\t");
	      System.out.println(tf1.getText()+"\t");
	      System.out.println(tf2.getText()+"\t");

		}
	public static void main(String[] args) 
	{
	new TextFieldEx();	
	}

	

}
    