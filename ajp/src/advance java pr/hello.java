import java.awt.*;
class hello extends Frame
{
	hello()
	{ FlowLayout f=new FlowLayout();
		setLayout(f);
		Label lb = new Label("Welcome To java");
		add(lb);
	}
	public static void main(String[] args) 
	{
		hello f1 =new hello();
		f1.setVisible(true);
		f1.setTitle("JAVA");
		f1.setSize(500,500);
	}
}
