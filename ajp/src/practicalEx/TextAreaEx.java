 package practicalEx;

import java.awt.*;

public class TextAreaEx extends Frame{
	TextArea tf,tf1,tf2,tf3,tf4;
	public TextAreaEx()
	{
		  setVisible(true);
		  setSize(500,500);
	      setLayout(new FlowLayout());
		  setTitle("TextAreaEx");
	      tf = new TextArea();
	      tf.setEditable(false);
	      tf1 = new TextArea("TextArea");
	      tf2 = new TextArea(10,19);
	      tf3 = new TextArea("TextField",10,20);
	      tf4 = new TextArea("TextAreaEx",10,20,1);
	      add(tf1);
	      add(tf);
	      add(tf3);
	      add(tf2);
	      add(tf4);
	      System.out.print(tf.getText()+"\t");
	}

	public static void main(String[] args) 
	{
		new TextAreaEx();
	}

}
