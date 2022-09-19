import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		int n, temp = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		
		//reading the number of elements from the that we want to enter
		n=sc.nextInt();
		
		//creates an array in the memory of length n
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
		//reading array elements from the user
		array[i]=sc.nextInt();
		}
		
		//sorting the array using selection sort
		for(int i = 0; i < n; i++) {
			int index = i;
			for(int j = i+1; j < n; j++) {
				if(array[j] < array[index]) {
					//searching index of for smallest no
					index = j;
				}
			}
			//swapping the elements
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		System.out.println("Array after sorting: ");
		
		//printing the result
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}

}
