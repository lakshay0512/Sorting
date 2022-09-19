import java.util.Scanner;

public class BubbleSort {
	
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
		
		//sorting the array using bubble sort
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n-i; j++) {
				if(array[j-1] > array[j]) {
					//swapping the elements
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting: ");
		
		//printing the result
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
