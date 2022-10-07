import java.awt.*;
class gridbaglayout extends Frame
{
	gridbaglayout()
	{
		setVisible(true);
		setSize( 430, 255);
		
		Label lb1 = new Label("name");
		lb1.setBounds(77, 20, 65,35); 
		TextField tf = new TextField();
		tf.setBounds(172,38, 96, 19);
		Label lb2 = new Label("comments");
		lb2.setBounds(77, 90, 50, 43);			
		TextArea ta = new TextArea();
		ta.setBounds(150,67, 188, 86);
		Button bt = new Button(" submit");
		bt.setBounds(152, 172, 96, 35);
		
		add(lb1);		
		add(tf);
		add(lb2);
		add(ta);
		add(bt);
		setLayout(null);
	}
	public static void main(String ar[])
	{ 
		new gridbaglayout();
	}
}