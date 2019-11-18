package InterviewPrograms;

import java.util.Arrays;

/* 
 * About    --> This program is to find largest and smallest numbers in an array
 * Solution --> initialize 2 int variables as the first index value of the array
 * 				then use for loop to traverse the num[]
 * 				then use if and else if to check largest and smallest and assign the values
 * 				print the values *
 */
public class ArrayFindLargestAndSmallestNumber {

	public static void main(String[] args) {

		int num[]= {5,23,78,9,1,-3,18,42};
		
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println("Given array is : "+Arrays.toString(num)); //effective way to print array values without using for loop
		System.out.println("Largest number is : "+largest);
		System.out.println("Smallest number is :"+smallest);	
	}

}
