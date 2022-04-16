package Unit_2;

public class P13_Assignment_Questions_Unit_02 {
   public static void main(String args[])
   {
	   Assignment_Questions_Unit_02 obj = new Assignment_Questions_Unit_02();
	   obj.abstractClassCall();
	   obj.overloadingAndOverriding();
	   obj.accessProtectionInJava();
	   obj.interfaceImplementation();
   }
}

class Assignment_Questions_Unit_02
{
	void overloadingAndOverriding()
	{
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	void abstractClassCall()
	{
		Sample3 obj = new Sample3();
		obj.run();
	}
	void accessProtectionInJava()
	{
		Sample3 obj = new Sample3();
		obj.display1();
		obj.display2();
	}
	void interfaceImplementation()
	{
		Sample3 obj = new Sample3();
		obj.display1();
		obj.display2();
	}
}

abstract class Sample2
{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void show()
	{
		System.out.println("INSIDE SAMPLE2 Parent Class");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
	
	public void display()
	{
		System.out.println("DISPLAY method insode abstract class Sample2!");
	}
	abstract void run();
}

class Sample3 extends Sample2 implements A3, B3
{
	public void display()
	{
		System.out.println("INSIDE ChildClass");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		//System.out.println("d = "+ d);
	}
	public void display1()
	{
		System.out.println("This is a display1 method in class Sample3 from Interface");
	}
	public void display2()
	{
		System.out.println("This is a display2 method in class Sample3 from Interface");
	}
	public void run()
	{
		System.out.println("Method from abstract class Sample2!");
	}
	public void run(int x)
	{
		System.out.println("Method from abstract class Sample2!");
	}
	public void run(int x, int y)
	{
		System.out.println("Method from abstract class Sample2!");
	}
}

interface A3
{
	public void display1();
}

interface B3
{
	public void display2();
}