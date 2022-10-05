import java.awt.*;
class grid extends Frame
{
	grid()
	{ 
		for ( Integer i =0;i<=9;i++)
		{
		add(new Button(i.toString()));
		}
		setLayout(new GridLayout(3,3));
		setVisible(true);
		setTitle("gridlayout");
		setSize(500,500);
	}
	public static void main(String ar[])
	{ 
		new grid();
	}
}