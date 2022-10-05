import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cb_jframe extends JFrame
{
	cb_jframe()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		JLabel l = new JLabel("");
		String s[] ={"sb"};
				JComboBox b = new JComboBox(s);
		add(b);

		/*l.setBounds(210, 59, 212, 43);
		JComboBox b = new JComboBox();
		b.setBounds(32,58,120,40);
		b.setModel(new DefaultComboBoxModel(new String[] {"Solapur", "Mumbai", "Pune", "Benglore"}));
		add(b);
		add(l);
		b.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{ 
				if(b.getSelectedIndex()>=0) 
				{
					l.setText("You are in "+b.getSelectedItem());	
				}	
			}
		});*/
	}
	public static void main(String ar[])
	{
		new cb_jframe();
	}
}