package Array;

import java.util.Arrays;

class ReverseArray{
	
	static void reverseArray(String[] arr,int start,int end){
		String temp;
		
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		String[] arr= {"a","b","c"};
		
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
//	System.out.println(Arrays.deepToString(arr));
			
		}
		
		
		String[] strArr=new String[arr.length];
		int i=0;
		for(int j=arr.length-1;j>=0;j--) {
			while(i<arr.length) {
				strArr[i]=arr[j];
				i++;
				break;
			}
		}
		System.out.println(Arrays.toString(strArr));
		
		
		reverseArray(arr,0,arr.length-1);
		
	}
	
	
}