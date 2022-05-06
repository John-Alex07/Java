package Assignment_01;

import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee rec[] = new Employee[8];
		
		for(int i = 0; i < 8; i++)
		{
			int a;
			long sal;
			String nm;
			char dep;
			System.out.println("Enter your Name : ");
			nm = sc.nextLine();
			nm = sc.nextLine();
			System.out.println("Enter the Age : ");
			a = sc.nextInt();
			System.out.println("Enter Salary : ");
			sal = sc.nextLong();
			System.out.println("Enter Department : ");
			dep = sc.next().charAt(0);
			
			rec[i] = new Employee(nm, a, sal, dep);
		}
		
		Employee obj = new Employee(rec);
		sc.close();
	}

}

class Employee
{
	String name;
	int age;
	long salary;
	char department;
	static long sal_A = 0;
	static long sal_B = 0;
	static long sal_C = 0;
	static long sal_D = 0;
	Employee(String n, int ag, long s, char d)
	{
		name = n;
		age = ag;
		salary = s;
		department = d;
	}
	
	Employee(Employee rec[])
	{
		
	    for(int i = 0; i < 8; i++)
	    {
	    	char ch = rec[i].department;
	    	switch(ch)
	    	{
	    	case 'A':
	    		sal_A = sal_A + rec[i].salary;
	    		break;
	    	case 'B':
	    		sal_B = sal_B + rec[i].salary;
	    	    break;
	    	case 'C':
	    		sal_C = sal_C + rec[i].salary;
	    	    break;
	    	case 'D':
	    		sal_D = sal_D + rec[i].salary;
	    		break;
	    	}
	    }
	}
}
	    		