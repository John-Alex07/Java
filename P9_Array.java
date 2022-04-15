/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */
package Unit_1;
public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = 0; j < arr.length-i-1; j++)
				if(arr[j] > arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
		}
		System.out.println("SORTED ARRAY : ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	void findTheDuplicateElements(int[] arr) {
		  for(int i = 0; i < arr.length; i++)   
	            for(int j = i + 1; j < arr.length; j++) 
	                if(arr[i] == arr[j])  
	                   System.out.print("\n"+arr[j]+" "); 
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int l = arr[0], sl = arr[1];
		int s = arr[0], ss = arr[1];
		for(int i = 1; i < arr.length; i++)
		{
			if(l < arr[i])
			{
				sl = l;
				l = arr[i];
			}
			if(s > arr[i])
				{
				   ss = s;
				   s = arr[i];
				}	  
		}
		
		System.out.println("\nSECOND LARGEST : "+sl);
		System.out.println("SECOND SMALLEST : "+ss);

	}

	void leftRotationInAnArray(int[] arr) {
		int temp = arr[0];
		for(int i = 1; i<arr.length;i++)
			arr[i-1] = arr[i];
		 arr[arr.length-1] = temp;
		 System.out.println("LEFT ROTATED ARRAY : ");
			for(int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");

	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}
