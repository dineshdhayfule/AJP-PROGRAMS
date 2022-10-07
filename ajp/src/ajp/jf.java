package ajp;

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.tree.*;

public class jf extends JFrame
{
	 

		jf()
		{
				 Container ct = getContentPane();
//				 setLayout(new GridLayout(3,2));
				 setSize(300,300);
				 setVisible(true);
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			 	 JCheckBox rb = new JCheckBox("first");
//				 add(rb);
//				 JCheckBox rb1 = new JCheckBox("second");
//				 add(rb1);
//				 ImageIcon i = new ImageIcon("F:\\IMG_20220730_133734.jpg");
//				 JLabel jb = new JLabel("INDIA",i,JLabel.CENTER);
//				 jb.getIcon();
//				 add(jb);
//				 JTextField jt = new JTextField(10);
//				 add(jt);
//				 JButton jb1 = new JButton("add name",i);
//				 add(jb1);
//				 jb1.addActionListener(new ActionListener()
//				 {
//						public void actionPerformed(ActionEvent e) 
//						{
//							jt.setText("Dinesh");
//							rb.setText("Dinesh");
//							rb1.setText("Dhayfule");
//						
//							
//						}
//					});
				 DefaultMutableTreeNode root = new DefaultMutableTreeNode("This PC");
				 DefaultMutableTreeNode c = new DefaultMutableTreeNode("C Drive");
				 DefaultMutableTreeNode d = new DefaultMutableTreeNode("D Drive");
				 DefaultMutableTreeNode e = new DefaultMutableTreeNode("E Drive");
				 DefaultMutableTreeNode f = new DefaultMutableTreeNode("F Drive");
				 DefaultMutableTreeNode a = new DefaultMutableTreeNode("Apps");
				 DefaultMutableTreeNode dn = new DefaultMutableTreeNode("Downloads");
				 DefaultMutableTreeNode pg = new DefaultMutableTreeNode("Program Files");
				
				 root.add(c);
				 root.add(d); 
				 root.add(e);
				 root.add(f);

				 c.add(a);
				 c.add(dn);
				 c.add(pg);
				 JTree t = new JTree(root);
				 add(t);
			 	 
		}
	
	public static void main(String[] args) {
		new jf();
	}

}
