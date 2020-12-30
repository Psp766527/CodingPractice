package Array;

import java.util.Arrays;

public class CopyingOfArrayUsingcopyOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define an array of type integer
		int[] arr= {1,2,3,4,5,6,7};
		
		//defining array and along with that copy elements of arr[] into new array using copyOf()
		int[] copyArray=Arrays.copyOf(arr, arr.length);
		
		System.out.println(Arrays.toString(copyArray));

	}

}
