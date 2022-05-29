package Unit_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileHandling_Task_01 {

	public static void main(String[] args) {
		A obj = new A();
		try {
			obj.CountWord();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class A
{
	int ctr=0;
	void CountWord()  throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("E:\\Java\\4th Sem\\src\\Unit_3\\Input.txt"));
		
//		String s = br.readLine();
		int str=0;
		
		while((str=br.read())!=-1)
		{
			if(str==32|| (char)str=='\n')
				ctr++;
		}
		
		System.out.println("Total number of words are: " +ctr);
		
		br.close();
	}
}