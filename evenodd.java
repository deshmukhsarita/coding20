import java.util.Scanner;
public class CountEvenOdd2 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i = 0, j = 0;
		int evenCount = 0, oddCount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		while (i < Size)
		{
			a[i] = sc.nextInt();
			i++;
		}   

		while(j < Size)
		{
			if(a[j] % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			j++;
		}
		
		System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
		System.out.println("\n Total Number of Odd  Numbers in this Array = " + oddCount);
    }1
	}