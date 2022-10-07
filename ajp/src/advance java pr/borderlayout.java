import java.awt.*;
class borderlayout extends Frame
{
	borderlayout()
	{
		setVisible(true);
		setSize(300,300);
		setTitle("borderlayout");
		BorderLayout b=new BorderLayout();
		setLayout(b);
		add(new Button("NORTH"),b.NORTH);		
		add(new Button("SOUTH"),b.SOUTH);
		add(new Button("EAST"),b.EAST);
		add(new Button("WEST"),b.WEST);
		add(new Button("CENTER"),b.CENTER);
	}
	public static void main(String ar[])
	{ 
		new borderlayout();
	}
}