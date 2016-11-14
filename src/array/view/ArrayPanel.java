package array.view;

import java.awt.Color;
import javax.swing.*;
import array.controller.ArrayController;

public class ArrayPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private ArrayController baseController;
	
	public ArrayPanel(ArrayController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the button");
		this.infoLabel = new JLabel("Wow words!");
		this.dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setBackground(Color.orange);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(myButton);
	}
	private void setupLayout()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(myButton);
	}
	private void setupListeners()
	{
		this.setBackground(Color.GREEN);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(myButton);
	}

}
