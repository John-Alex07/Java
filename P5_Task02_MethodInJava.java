package Unit_1;

public class P5_Task02_MethodInJava {
	public void display()
	{
	   System.out.println("DISPLAY METHOD\n");
	}
	public void input()
	{
		System.out.println("INPUT METHOD");
	}
	public static void main(String args[])
	{
		System.out.println("MAIN METHOD\n");
        P5_Task02_MethodInJava obj = new  P5_Task02_MethodInJava();
        obj.display();
        obj.input();
	}
}
