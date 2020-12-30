package Array;

import java.util.Arrays;

public class CopyingOfArrayUsing_arraycopyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define an integer array
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		//define an integer array again and use System class arrayscopy() method
		int[] copyArray=new int[arr.length];
		
		System.arraycopy(arr, 0, copyArray, 0, arr.length);
		
		System.out.println(Arrays.toString(copyArray));

	}

}
