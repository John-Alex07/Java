package Assignment_01;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :\n");
		int num = sc.nextInt();
		
		TestClass obj = new TestClass();
		obj.display(num);
		sc.close();
		
	}

}

interface In1
{
	void display(int p);
}

class TestClass implements In1
{
	public void display(int p)
	{
		int flag = 0;
		for(int i = 2; i < Math.sqrt(p); i++)
		   if(p % i == 0)
			   {
			      flag = 1;
			      break;
			   }
		if(flag != 1 && p != 1 && p != 0)
			System.out.println(p+" is PRIME. ");
		else
			System.out.println(p+" is not PRIME. ");
	}
}