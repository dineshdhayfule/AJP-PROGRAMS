package ajp;
import java.awt.*;
public class gbl extends Frame{
	gbl(){
		setVisible(true);
		setSize(500,500);
		GridBagLayout grid= new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(grid);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		add(new Button("Button One"),gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		add(new Button("Button Two"),gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx=0;
		gbc.gridy=1;
		add(new Button("Button Three"),gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		add(new Button("Button Four"),gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth= 2;
		add(new Button("Button Five"),gbc);
	}
	public static void main(String ar[]){
		new gbl();
	}
}