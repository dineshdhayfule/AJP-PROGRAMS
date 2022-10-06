package practicalEx;

import java.awt.*;
public class CheckBoxEx extends Frame {

	public CheckBoxEx()
	{
	setVisible(true);
	setSize(500,800);
	setLayout(new FlowLayout());
	CheckboxGroup chq = new CheckboxGroup();
	Checkbox c = new Checkbox();
	add(c);
	Checkbox ch = new Checkbox("pink",true);
	add(ch);
	Checkbox ch1 =  new Checkbox("black",false,chq);
    add(ch1);
	Checkbox ch2 = new Checkbox("white",false,chq);
	add(ch2);
	c.setLabel("colors");
	System.out.println("label name: "+c.getLabel());
	c.setState(true);
	System.out.print("colors State: "+c.getState());

	}

	public static void main(String[] args) 
	{
		new CheckBoxEx();
	}
}