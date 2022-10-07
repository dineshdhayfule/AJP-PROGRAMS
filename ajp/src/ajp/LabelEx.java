package ajp;

import java.awt.*;
import java.applet.*;
public class LabelEx extends Applet
{
	public void init()
	{
		setVisible(true);
		setSize(500,500);
		Label lb1 = new Label();
		Label lb2 = new Label("This is Label");
		add(lb1);
		add(lb2);
	}
}
/*
<applet code="LabelEx" height=500 width=500>
</applet>
*/