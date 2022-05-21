package Assignment_01;
/*
 *  If We Place Return Type In Constructor Prototype Will It Leads To Error? 
 *  Ans. No, because compiler and JVM considers it as a method.
 */

public class Ques12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		System.out.println(a.A1());
	}

}
class A1
{
	int A1()
	{
		return 1;
	}
}