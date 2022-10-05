import java.awt.*;
public class flow extends Frame 
{
	flow ()
	{
		setVisible(true);
		setTitle("FORM");
		setSize(700,400);
		setLayout(new FlowLayout());			
		add(new Label("ENTER USERNAME"));
		add(new TextArea());
		add(new Label("ENTER PASSWORD"));
		add(new TextField());
		add(new Button("SUBMIT"));
	}
	public static void main(String ar[])
	{
		new flow();
	}
}