package ajp;

//menu of colors 
import java.awt.*;
public class menu extends Frame{
	menu(){
		setVisible(true);
		setSize(726,500);
		MenuBar mb = new MenuBar();
		Menu mn = new Menu ("Colors");
		MenuItem mi1 = new MenuItem("Black");
		mi1.setEnabled(false);
		mn.add(mi1);
		mn.add(new MenuItem("Red"));
		mn.add(new MenuItem("Blue"));
		mb.add(mn);		
		setMenuBar(mb);
	}
	public static void main(String ar[]){
		new menu();
	}
}
