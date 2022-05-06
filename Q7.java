package Assignment_01;

import java.util.*;

public class Q7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student_AB obj[] = new Student_AB[4];
		String nm;
		int ag;
		float per;
		char s;
		for(int i = 0; i < 4; i++)
		{
			System.out.println("ENTER THE NAME, AGE, PERCENTAGE AND SECTION : ");
			 nm = sc.next();
			 ag = sc.nextInt();
			 per = sc.nextFloat();
			 s = 'A';
			obj[i] = new Student_AB(nm, ag, per, s);
			obj[i].display();
		}
		System.out.println("AVERAGE OF SECTION A : "+obj[0].avg_per(obj));
		System.out.println("COUNT FOR CALLS OF CONSTRUCTOR : "+Student_AB.count);
		System.out.println("COUNT FOR CALLS OF DISPLAY() : "+Student_AB.c);
		sc.close();
	}
}

class Student_AB
{
	String Name;
	int Age;
	float percentage;
	char section;
	float avg_percent;
	static int count = 0;
	static int c = 0;
	Student_AB(String nm, int a, float percent, char sec)
	{
		Name = nm;
		Age = a;
		percentage = percent;
		section = sec;
		count++;
	}
	 float avg_per(Student_AB ob[])
	    {
	    	avg_percent = 0;
	    	for(int i = 0; i < 4; i++)
	    		avg_percent = avg_percent + ob[i].percentage;
	    	avg_percent = avg_percent/4;
	    	return avg_percent;
	    }
	 public void display()
	 {
		 c++;
	 }
}
