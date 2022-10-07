
package practicalEx;

import java.awt.*;

public class MenuBarEx extends Frame
	{

	public MenuBarEx() 
	{
		  setVisible(true);
		  setSize(500,500);
	      setLayout(new FlowLayout());
		  setTitle("MenuBarEx");
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

	public static void main(String[] args) 
	{
		new MenuBarEx();
	}
}
