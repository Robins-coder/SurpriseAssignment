package assignment;

import java.util.Scanner;

public class SecondProgram {

	private void drive() {
	
		System.out.println(" First 10 fibonacci prime number");
		
		int count=0;
        int firstnumber=1;
		int secondnumber=1;
        int thirdnumber;
		while(true) 
        {    
             thirdnumber=firstnumber+secondnumber;
             if(checkprime(thirdnumber)) 
             { count++;
            	 System.out.print(" "+thirdnumber+" ");
                
             }
             
             firstnumber=secondnumber;
             secondnumber=thirdnumber;
        	
           	if(count==10) 
           	{
           		break;
           	}
        }
		
	}
	
	
	private boolean checkprime(int thirdnumber) {
		int flag=0;
		   if(thirdnumber==0 || thirdnumber==1)
			   return false;
		
		  for(int i=2;i<=thirdnumber/2;i++) 
		  {
			  if(thirdnumber%i==0) 
			  {
				  flag=1;
			      break;
			  }
		  }
		
		  if(flag==0) 
		  {  
			  return true;
		  }
		  else {
			  return false;
		  }
	}


	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
    
		SecondProgram program=new SecondProgram();
         program.drive();
		
		
	}

	
	
}
