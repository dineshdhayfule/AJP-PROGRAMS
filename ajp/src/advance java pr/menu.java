import java.awt.*;
class menu extends Frame
{
	menu()
	{
		setTitle("MenuBar	");
		setVisible(true);
		setSize(500,500);
		FlowLayout f=new FlowLayout();
		setLayout(f);

		 MenuBar mb =new MenuBar();
         Menu m1 = new Menu("file");
         Menu m2 = new Menu("sort");
         MenuItem mn1 = new MenuItem("save");
         MenuItem mn2 = new MenuItem("date");

         mb.add(m1);
         mb.add(m2);
         m1.add(mn1);
         m2.add(mn2);
         CheckboxMenuItem cmil = new CheckboxMenuItem("Word Wrap",true);
	     setMenuBar(mb);
		
	}
	public static void main(String[] args) 
	{
		menu l1 = new menu();
	}
}