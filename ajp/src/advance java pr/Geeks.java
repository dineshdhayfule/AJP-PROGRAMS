import javax.swing.*;
class Geeks extends JFrame
{
    public Geeks()
    {
        setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
        String lang[] ={"C","HTML","Data Structure","C++", "SQL","VB.NET","Java","JavaScript"};
		JList list = new JList(lang);
        JScrollPane sp = new JScrollPane(list);
        getContentPane().add(sp);
    }
    public static void main(String args[])
    {
        new Geeks(); 
    }
}