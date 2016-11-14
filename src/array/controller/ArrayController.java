package array.controller;

import array.model.Array;
import array.view.ArrayFrame;

public class ArrayController 
{
	private String [] words = {"this","is","the","next","level","of","hipster","the","initialization","sequence"};
	private Array [] arrays;
	private int [] numbers;
	private ArrayFrame appFrame;
	
	public ArrayController()
	{
		showArrayLevelThree();
		arrays = new Array [5];
		appFrame = new ArrayFrame(this);
	}
	public void start()

	{
		for(int index = 0; index < arrays.length; index++)
		{
			arrays[index] = new Array("Array #" + index);
		}
		
		arrays[0].setName("asdasd");
		for(Array current : arrays)
		{
			System.out.println(current);
		}
	}
	private void showArrayLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	
	public Array[] getArray()
	{
		return  arrays;
	}
	public String[] getWords()
	{
		return words;
	}
	public int[] getNumbers()
	{
		return numbers;
	}
}

