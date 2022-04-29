package Assignment_01;

import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student obj[] = new Student[4];
		String nm;
		int ag;
		float per;
		char s;
		for(int i = 0; i < 4; i++)
		{
			System.out.println("ENTER THE NAME, AGE, PERCENTAGE AND SECTION :\n");
			 nm = sc.next();
			 ag = sc.nextInt();
			 per = sc.nextFloat();
			 s = sc.next().charAt(0);
			obj[i] = new Student(nm, ag, per, s);
		}
		System.out.println("AVERAGE OF SECTION A : "+obj[0].avg_per(obj));
		sc.close();
	}
}

class Student
{
	String Name;
	int Age;
	float percentage;
	char section;
	float avg_percent;
	Student(String nm, int a, float percent, char sec)
	{
		Name = nm;
		Age = a;
		percentage = percent;
		section = sec;
	}
	 float avg_per(Student ob[])
	    {
	    	avg_percent = 0;
	    	for(int i = 0; i < 4; i++)
	    		avg_percent = avg_percent + ob[i].percentage;
	    	avg_percent = avg_percent/4;
	    	return avg_percent;
	    }
}