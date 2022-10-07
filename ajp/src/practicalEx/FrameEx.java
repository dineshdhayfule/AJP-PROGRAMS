package practicalEx;

import java.awt.*;
public class FrameEx 
{
	FrameEx()
	{
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setTitle("Frame");
	}
	public static void main(String[] args) {
		new FrameEx();
	}
}
