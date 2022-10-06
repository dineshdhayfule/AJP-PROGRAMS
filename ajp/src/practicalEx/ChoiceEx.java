package practicalEx;

import java.awt.*;
public class ChoiceEx extends Frame 
{

	public ChoiceEx() 
	{
		setVisible(true);
		setSize(800,800);
		setLayout(new FlowLayout());
		Choice c = new Choice();
		c.add("red");
		c.add("blue");
		c.add("yellow");
		add(c);
		System.out.println("Item Count: "+c.getItemCount());
		c.select(0);
		System.out.println("Item selected: "+c.getSelectedItem());
		Choice c1 = new Choice();
		c1.add("squre");
		c1.add("circle");
		c1.add("triangle");
		add(c1);
		System.out.println("Item selected: "+c1.getSelectedIndex());
		c1.select("circle");
		System.out.println("Item selected: "+c1.getItem(0));

	}

	public static void main(String[] args) 
	{
	new ChoiceEx();
	}

}
