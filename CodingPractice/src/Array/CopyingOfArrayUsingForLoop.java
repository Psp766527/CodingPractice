package Array;

import java.util.Arrays;

public class CopyingOfArrayUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining an integer array
		int[] arr= {1,2,3,4,5};
		//again define an integer array in which we will copy above array
		int[] copyArray=new int[arr.length];
		
		//copying of an array using for loop
		
		for(int i=0;i<arr.length;i++) {
			copyArray[i]=arr[i];
		}
		//printing elements copyArray by using Array.toString() method
		System.out.println(Arrays.toString(copyArray));
	}

}
