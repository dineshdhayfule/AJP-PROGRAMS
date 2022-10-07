import java.awt.*;
class Checkbox1 extends Frame
{
	Checkbox1()
	{   FlowLayout f=new FlowLayout();
		setLayout(f);
		Label lb = new Label("Select Languages You know : ");
		add(lb);
		Checkbox cb1 = new Checkbox("Marathi");
		add(cb1);
		Checkbox cb2 = new Checkbox("Hindi");
		add(cb2);
		Checkbox cb3 = new Checkbox("English");
		add(cb3);
		Checkbox cb4 = new Checkbox("Sanskrit");
		add(cb4);
	}
	public static void main(String[] args) 
	{
		Checkbox1 f1 =new Checkbox1();
		f1.setVisible(true);
		f1.setTitle("JAVA");
		f1.setSize(500,500);
	}
}
