package Unit_1;

public class P2_Task02_ConstantsInJava {

	// final double pi = 3.14; We can't access the non-static members int the static function
	 static final int x = 4;
	public static void main(String[] args) {
		final double pi = 3.14;
		System.out.println(pi);
		System.out.println(x);
	
		
	}
}