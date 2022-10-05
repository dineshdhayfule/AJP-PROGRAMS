import java.awt.*;
class gridlayout extends Frame
{
	gridlayout()
	{ 
		for ( Integer i =1;i<=25;i++)
		{
		add(new Button(i.toString()));
		}
		setLayout(new GridLayout(5,5));
		setVisible(true);
		setTitle("gridlayout");
		setSize(500,500);
	}
	public static void main(String ar[])
	{ 
		new gridlayout();
	}
}