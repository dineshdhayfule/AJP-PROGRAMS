package ajp;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuItem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class swing extends JFrame
{
	private JPanel contentPane;

	swing()
	{
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Swings");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(10, 70, 112, 43);
		contentPane.add(lblNewLabel_1);
		JMenuBar mb = new JMenuBar();
		JMenu mn = new JMenu ("File");
		JMenu mn1 = new JMenu ("New");

		JMenuItem mi1 = new JMenuItem("save");
		JMenuItem mi2 = new JMenuItem("class");
		JMenuItem mi3 = new JMenuItem("package");

		mn.add(mi1);
		mn1.add(mi2);
		mn1.add(mi3);

		mb.add(mn);
		mn.add(mn1);
		
		setJMenuBar(mb);
		
		JLabel jl = new JLabel("example");
		jl.setBounds(50, 90, 112, 43);
		jl.setFont(new Font("Tahoma", Font.BOLD, 19));
		contentPane.add(jl);
	}

	public static void main(String[] args) 
	{
		new swing();
	}

}
