package Assignment_01;

public class Q4 {
	public static void main(String args[])
	{
		ClassThree obj = new ClassThree(0);
		ClassThree obj1 = new ClassThree();
	}

}

class ClassOne
{
	int n;
	ClassOne(int num)
	{
		n = num;
		System.out.println("Inside ClassOne\nVALUE = "+n);
	}
}

class ClassTwo extends ClassOne
{
	ClassTwo()
	{
		super(1);
		System.out.println("Inside ClassTwo\nVALUE = "+n);
	}
}

class ClassThree extends ClassTwo
{
	ClassThree()
	{
		System.out.println("Inside ClassThree DEFAULT CONSTRUCTOR.\nVALUE = "+n);
	}
	
	ClassThree(int n)
	{
		System.out.println("Inside ClassThree PARAMETERISED CONSTRUCTOR.\nVALUE = "+n);
	}
}