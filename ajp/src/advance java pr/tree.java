import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
class tree extends JFrame
{ 				 
	DefaultMutableTreeNode pc,c,d,e,f,a,dn,pg;
		tree()
		{
				 Container ct = getContentPane();
				 setSize(300,300);
				 setVisible(true);
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 pc = new DefaultMutableTreeNode("This PC");
				  c = new DefaultMutableTreeNode("C Drive");
				  d = new DefaultMutableTreeNode("D Drive");
				  e = new DefaultMutableTreeNode("E Drive");
				  f = new DefaultMutableTreeNode("F Drive");
				  a = new DefaultMutableTreeNode("Apps");
				  n = new DefaultMutableTreeNode("Downloads");
			     pg = new DefaultMutableTreeNode("Program Files");
				 pc.add(c);
				 pc.add(d); 
				 pc.add(e);
				 pc.add(f);
				 c.add(a);
				 c.add(dn);
				 c.add(pg);
				 JTree t = new JTree(pc);
				 add(t);
				}
			public static void main(String[] args)
			{
				new tree();
			}
}