package InterviewPrograms;

/* 
 * About    --> This program illustrates how to swap 2 integers without third variable	
 * Solution --> Use mathematical concept
 * 				x=x+y
 * 				y=x-y
 * 				x=x+y
 *
 */
public class SwapIntegersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int y=2;
		x= x+y; //5
		y= x-y; //3
		x= x-y; //2
	}

}
