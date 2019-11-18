package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

/* 
 * About    --> This program is to find duplicates in an array	
 * Solution --> use HashSet
 * Solution --> use dual for loops one starting from first element i=0 and next one j=i+1 and iterate and verify
 *
 */
public class ArrayFindDuplicates {

	public static void main(String[] args) {

		String travellerNames[]= {"Manu","Bipin","Sanjay","Jibin","Sanjay","Hari","Bipin"};
		int length=travellerNames.length;
		
		//this is o(n*n) [o n square] solution as it will take a lot of time(time complexity)
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(travellerNames[i].equalsIgnoreCase(travellerNames[j]))
				{
					System.out.println("Duplicate entry found in array - "+travellerNames[i]);
				}
				
			}
		}
		
		//this is o(n) solution as it will take less time by using HashSet, as hashset takes only unique values(time complexity)
		Set <String> store=new HashSet<String>();
		for(String name : travellerNames)
		{
			if(store.add(name)==false)
			{
				System.out.println("Duplicate element - "+name);
			}
		}
	}

}
