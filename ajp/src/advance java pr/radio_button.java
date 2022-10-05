import java.awt.*;
class radio_button extends Frame 
{
	radio_button ()
	{
		setVisible(true);
		setTitle("RADIO BUTTON AND CHECKBOX");
		setSize(700,400);
		setLayout(new FlowLayout());
	
		CheckboxGroup cb = new CheckboxGroup();
		
		add(new Checkbox("RADIO_BUTTON1",cb,false));
		add(new Checkbox("RADIO_BUTTON2",cb,false));
		add(new Checkbox("RADIO_BUTTON3",cb,false));
		
		add(new Checkbox("Checkbox1"));
		add(new Checkbox("Checkbox2"));
		add(new Checkbox("Checkbox3"));
	}
	public static void main(String ar[])
	{
		new radio_button();
	}
}