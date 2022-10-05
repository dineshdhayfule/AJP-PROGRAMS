package practicalEx;

import java.awt.List;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ListEx extends Frame 
{

	public ListEx() 
	{
		setVisible(true);
		setSize(800,800);
		setLayout(new FlowLayout());
		List c = new List();
		c.add("red");
		c.add("blue");
		c.add("yellow");
		add(c);
		System.out.println("Item Count: "+c.getItemCount());
		c.select(1);
		System.out.println("Item selected: "+c.getSelectedItem());
		List c1 = new List(2,true);
		c1.add("squre");
		c1.add("circle");
		c1.add("triangle");
		add(c1);
		System.out.println("Item selected: "+c1.getItem(0));
	}

	public static void main(String[] args) 
	{
	new ListEx();
	}

}
