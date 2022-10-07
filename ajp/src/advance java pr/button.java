import java.awt.*;
class button extends Frame
{
	button()
	{ FlowLayout f=new FlowLayout();
		setLayout(f);
		Button b1 = new Button("Ok");
		add(b1);
		Button b2 = new Button("Reset");
		add(b2);
		Button b3 = new Button("Cancel");
		add(b3);
	}
	public static void main(String[] args) 
	{
		button f1 =new button();
		f1.setVisible(true);
		f1.setTitle("JAVA");
		f1.setSize(500,500);
	}
}