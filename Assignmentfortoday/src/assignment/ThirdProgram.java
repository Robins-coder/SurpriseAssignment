package assignment;

import java.util.Scanner;

public class ThirdProgram {

	public static void main(String[] args) {
		
		ThirdProgram program=new ThirdProgram();
		program.drive();
		
	}

	private void drive() {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter First Name : ");
		String firtString=scanner.next();
		System.out.println(" Enter Second Name : ");
		String SecondString=scanner.next();		
		
	       int flag=0;	
		    
	       
	       if(SecondString.length()>firtString.length()) 
	       {
	    	   flag=checkAnagram(SecondString,firtString);
	       }
	       else 
	       {
	    	   flag=checkAnagram(firtString,SecondString);
	       }
	       
			
			
			if(flag==1) 
			{
				System.out.println(" This Two String Are Not Anagarm !");
			}
			else 
			{
				System.out.println(" This Two String Are  Anagarm !");
			}
	}

	private int checkAnagram(String first, String second) {
               
		           for(int j=0;j<first.length();j++) 
					{
						if(second.contains(""+first.charAt(j))) 
						{
							continue;
						}
						else 
						{  return 1;
						}
					}
		           return 0;
		           	
	}
	
	
	

}
