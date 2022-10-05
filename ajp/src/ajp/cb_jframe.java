package ajp;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class cb_jframe extends JFrame
{
	cb_jframe()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("JFrame Combo Box");
		setLayout(null);
		JLabel l = new JLabel("Select City");
		l.setBounds(210, 59, 212, 43);                                                                                  
		l.setFont(new Font("Times New Roman", Font.BOLD, 23));
		JComboBox b = new JComboBox();
		b.setBounds(32,58,134,44);                                                                                  
		b.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Solapur", "Mumbai", "Pune", "Benglore"}));
		b.setFont(new Font("Times New Roman", Font.BOLD, 23));                                                                                  
		add(b);
		add(l);
		b.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{ 
				if(b.getSelectedIndex()==0)                                                                                   
				{
					l.setText("Select City");	
				}
				else {
					
					l.setText("You are in "+b.getSelectedItem());	

				}
			}
		});
	}
	public static void main(String ar[])
	{
		new cb_jframe();
	}
}