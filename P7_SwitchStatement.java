/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */
package Unit_1;
import java.util.*;
class SwitchStatements 
{
	void switchStatements() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("CURRENT YEAR : 2022\n");
			break;
		case 2:
			System.out.println("CURRENT MONTH : APRIL\n");
			break;
		case 3:
			System.out.println("CUREENT DAY : SUNDAY");
			break;
		case 4:
			System.out.println("Not Applicable\n");
			break;
		default:
			System.out.println("INVALID INPUT\n");
		}
		sc.close();
	}
}
public class P7_SwitchStatement 
{

	public static void main(String[] args) 
	{
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}
}