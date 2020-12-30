package Array;

import java.util.Arrays;

public class CopyingOfArrayUsingcloneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define an integer array
		 int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		 
	        //creating a copy of array 'a' using clone() method
	 
	        Object b = a.clone();  
	 
	        //Printing elements of array 'b'
	 
	      
		
		System.out.println(Arrays.toString((long[]) b));
		

	}

}
