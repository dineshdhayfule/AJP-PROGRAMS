package practicalEx;

import java.awt.*;
public class ButtonEx extends Frame
{
	ButtonEx()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("Button");
		setLayout(new FlowLayout());
		Button lb1 = new Button();
		Button lb2 = new Button("This is Button2");
		add(lb1);
		add(lb2);
		lb1.setLabel("This is Button1");
		System.out.println("Button1 text : "+lb1.getLabel());
		System.out.println("Button1 text : "+lb2.getLabel());
	}
	public static void main(String[] args) {
		new ButtonEx();
	}
}
