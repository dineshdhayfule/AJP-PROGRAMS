package practicalEx;

import java.awt.*;

public class ScrollBarEx extends Frame
{

	public ScrollBarEx() 
	{
		  setVisible(true);
		  setSize(500,500);
	      setLayout(new FlowLayout());
		  setTitle("ScrollBarEx");
	      Scrollbar br= new Scrollbar();
	      add(br);
	      br.setValue(0);
	      System.out.println(br.getValue());
	      Scrollbar br1= new Scrollbar(0);
	      add(br1);
	      Scrollbar br2= new Scrollbar(Scrollbar.VERTICAL,1,0,1,50);
	      add(br2);
	}

	public static void main(String[] args) 
	{
		new ScrollBarEx();
	}

}
