package ajp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Canvas;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class combobox extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combobox frame = new combobox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public combobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Select City");
		TextField jt = new TextField ();
		 jt.setEchoChar('*');
		 getContentPane().add(jt);
		lblNewLabel.setBounds(210, 59, 212, 43);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setForeground(Color.BLACK);
		getContentPane().add(lblNewLabel);
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{ 
				if(comboBox.getSelectedIndex()==0) 
				{
					lblNewLabel.setText("Select City");	
				}
				else {
					
					lblNewLabel.setText("You are in "+comboBox.getSelectedItem());	

				}
			}
		});
		comboBox.setBounds(32, 58, 134, 44);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 23));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Solapur", "Mumbai", "Pune", "Benglore"}));
		contentPane.add(comboBox);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.GREEN);
		canvas.setBounds(230, 195, 212, 100);
		contentPane.add(canvas);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(268, 395, 85, 21);
		contentPane.add(btnNewButton);
		
		
		
		//
	}
}
