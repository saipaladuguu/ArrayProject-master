package array.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import array.controller.ArrayController;
public class ArrayFrame extends JFrame
{
	private ArrayPanel appPanel;
	private ArrayController baseController;
	
	public ArrayFrame(ArrayController baseController)
	{
		this.baseController = baseController;
		this.appPanel = new ArrayPanel(baseController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("Array Day 2016");
		this.setResizable(false);
		this.setVisible(true);
	}

}
