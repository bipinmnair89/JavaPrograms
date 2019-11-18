package InterviewPrograms;

/* 
 * About    --> This program is to find missing number from an array sequence	
 * Solution --> add the numbers in array(1) and then add the total sequence(2) and minus it from (1) 
 *
 */
public class ArrayFindMissingNumber {

	public static void main(String[] args) {

		int num[]= {1,2,3,4,5,7,8,9,10};
		
		int arraySum=0;
		for(int i=0;i<num.length;i++)
		{
			arraySum=arraySum+num[i];
		}
		System.out.println("Array Sum is :- "+arraySum);
		
		int sequenceTotalSum=0;
		for(int j=1;j<=10;j++)
		{
			sequenceTotalSum=sequenceTotalSum+j;
		}
		System.out.println("Sequence Sum is :- "+sequenceTotalSum);
		
		
		System.out.println("Missing number is :- "+(sequenceTotalSum-arraySum));
	}

}
/* Here in the second loop j starts from 1 as 1 is the first number in num[]
 * We can check the boundary value condition here by removing 10 from num[] and giving j<=10
 * so it will check for 10 also and if 10 is not there then it would show the missing number as 10
 */
