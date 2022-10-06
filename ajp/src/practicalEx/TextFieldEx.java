package practicalEx;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldEx extends Frame 
{
	TextField tf,tf1,tf2,tf3;
	public TextFieldEx()
	{
      setVisible(true);
      setSize(500,500);
	  setTitle("TextFieldEx");
      setLayout(new FlowLayout());
      tf = new TextField("dinesh",10);
      tf.setEditable(false);
      tf1 = new TextField();
      tf1.setEchoChar('*');
      tf2 = new TextField(10);
      tf3 = new TextField("dhayfule");
      add(tf1);
      add(tf);
      add(tf3);
      add(tf2);
      System.out.print(tf.getText()+"\t");
      System.out.print(tf.getEchoChar());

	}
	public static void main(String[] args) 
	{
	new TextFieldEx();	
	}
}
    