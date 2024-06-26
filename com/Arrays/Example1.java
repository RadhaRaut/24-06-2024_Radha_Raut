package com.Arrays;

public class Example1 {

	public static void main(String[] args) {

		int arrays[] = new int[4];

		arrays[0] = 20;
		arrays[1] = 30;
		arrays[2] = 40;
		arrays[3] = 50;

		for (int value : arrays)
		{
			System.out.println(value);
			}
		
	
		}
	/*Disadvantage of arrays:
	 * 
	 * 1.size is fixed
	 * 2.only specific data type
	 * 3.manipulation on array values is notr possible(add , remove ) we do not have library support.
	 * 
	 * Advantages of arrays:
	 * 1.faster access provides
	 * 2.static data 
	 */

}
