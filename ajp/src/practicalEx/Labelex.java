package practicalEx;

import java.awt.*;
public class Labelex extends Frame
{
	Labelex()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("Label");
		setLayout(new FlowLayout());
		Label lb1 = new Label();
		Label lb2 = new Label("This is Label2");
		Label lb3 = new Label("This is l2",Label.LEFT);
		add(lb1);
		add(lb2);
		add(lb3);
		lb1.setText("This is Label1");
		System.out.println("label1 text : "+lb1.getText());
	}
	public static void main(String[] args) {
		new Labelex();
	}
}
