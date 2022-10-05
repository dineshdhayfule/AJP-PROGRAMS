import java.awt.*;
class list extends Frame
{
	list()
	{
		setTitle("List box");
		setVisible(true);
		setSize(500,500);

		FlowLayout f=new FlowLayout();
		setLayout(f);

		List l = new List(5,true);

		l.add("LA");
		l.add("Solapur");
		l.add("Mumbai");
		l.add("Pue");
		l.add("Delhi");
		l.add("Bengluru");
		l.add("Goa");
		l.add("Madrid");
		l.add("Spain");
		l.add("Birmingham");
		add(l);
		
	}
	public static void main(String[] args) 
	{
		list l1 = new list();
	}
}