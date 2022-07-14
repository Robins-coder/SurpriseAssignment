package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class FourthProgram {

	
	private void drive() {
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter ArrayLength : ");
		int len=scanner.nextInt();
		System.out.println();
		int arr[]=new int[len];
		for(int i=0;i<len;i++) 
		{   System.out.print("=> ");;
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Enter divisor number : ");
		int k=scanner.nextInt();
		
		System.out.println("Arrays is "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if((arr[i]+arr[j])%k==0) 
				{
					System.out.print(" [ "+arr[i]+","+arr[j]+"]");
					
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		FourthProgram fourthProgram=new FourthProgram();
		fourthProgram.drive();
	}

	
	
}
