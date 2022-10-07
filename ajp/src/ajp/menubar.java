package ajp;
import java.awt.*;

public class menubar extends Frame
{
	menubar()
	{
		setLayout(new FlowLayout());
		setTitle("menubar");
		setVisible(true);
		setSize(726,500);
		
		MenuBar mb = new MenuBar();
		Menu mn = new Menu ("C");
		Menu mn1 = new Menu ("New");

		MenuItem mi1 = new MenuItem("save");
		MenuItem mi2 = new MenuItem("class");
		MenuItem mi3 = new MenuItem("package");
		mn.add(mi1);
		mn1.add(mi2);
		mn1.add(mi3);
		mb.add(mn);
		mn.add(mn1);
		
		setMenuBar(mb);
		
	}
	
	public static void main(String ar[])
	{
		new menubar();
	}
}
