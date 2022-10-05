import java.awt.*;
class list1 extends Frame
{
	list1()
	{
		Label lb = new Label("Select newspaper");
		setTitle("List box");
		setVisible(true);
		setSize(500,500);

		FlowLayout f=new FlowLayout();
		setLayout(f);

		List l = new List(5,true);

		l.add("Times of India");    
		l.add("New York Times");
		l.add("BBC");
		l.add("India Today");
		add(lb);
		add(l);
		
	}
	public static void main(String[] args) 
	{
		list1 l1 = new list1();
	}
}