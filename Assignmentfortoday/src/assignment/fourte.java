package assignment;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class fourte {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		fourte fourte=new fourte();
		
		System.out.println(" press 1 start game ");
		int choice=scanner.nextInt();
		if(choice==1) 
		{
		
			fourte.start();
		}
		else 
		{
			System.out.println("Exit !!!");
		}
		
	}

	private void start() {
		Scanner scanner=new Scanner(System.in);
	    int scorepoint=0;
		int min = 1;  
		int max = 9;  
		//Generate random double value from 200 to 400
		
		
	    
		while(true) 
		{   //int temp=(int)Math.random()*(10-1+1)+1;//2
			double a = Math.random()*(max-min+1)+min;  
			
			int target=(int) a;
			
			//target--;
			
			
			 System.out.println(target);//92
			
			 int temp=2;
		     int firstnumber=(target/2);//46
			
			
			double firstnumberhalf=(firstnumber/2);//23
			System.out.println(firstnumberhalf);
			int secondnumber=(int)(firstnumberhalf+temp);//23+2 
			int thirdnumber=temp;//2
			
			int furthnumber=(firstnumber/2);//23
			
			
		     int sumOfValue=0; 
			int leaveinnerpage=3;
	inner:while(true) 
			{			System.out.println(" firstNumber "+(firstnumber)+" \n secondNumber "+secondnumber+" \n thirdNumber  "+thirdnumber+" fourthNumber "+furthnumber );

			   	if(sumOfValue==target) 
			   	{
			   		scorepoint++;
			   		System.out.println("Stop Game press 0 ");
			   	}
			   	else 
			   	{  
                    System.out.println("Enter Input :");
			   		String value=scanner.next();
			   		sumOfValue=value(value);
			   		
			   		//			   	   System.out.println("enter First Number :");
//			   	   int getFirtNumber=scanner.nextInt();
//			   	   sumOfValue=getFirtNumber;
//				   	System.out.println("---------------------------------");			   	   
//				   	   System.out.println(sumOfValue);
//				   	System.out.println("---------------------------------");
//				   	   
//			   	   
//			   	   System.out.println(" press 1 -> + 2 -> - 3 -> * 4 -> / ");
//			   	   System.out.println("Enter Operant :");
//			   	   String operant=scanner.next();
//			   	  // sumOfValue+=ArithmaticOperation(sumOfValue,getFirtNumber,operant);
//                   
//			   	   
//			   	   System.out.println("enter Second Number :");
//			   	   int getSecondNumber=scanner.nextInt();
//				   	   
//			   	   System.out.println(" press 1 -> + 2 -> - 3 -> * 4 -> / ");
//			   	   System.out.println("Enter Operant :");
//			   	   String operant2=scanner.next();
//			   	   sumOfValue+=ArithmaticOperation(sumOfValue,getSecondNumber,operant2);	   	   
//
//			   	System.out.println("---------------------------------");			   	   
//			   	   System.out.println(sumOfValue);
//			   	System.out.println("---------------------------------");
//			   
//			   	   
//			   	   
//			   	   System.out.println("enter Third Number :");
//			   	   int getThirdNumber=scanner.nextInt();
//
//				   	   
//			   	   System.out.println(" press 1 -> + 2 -> - 3 -> * 4 -> / ");
//			   	  
//			   	   System.out.println("Enter Operant :");
//			   	   String operant3=scanner.next();
//			   	   sumOfValue+=ArithmaticOperation(sumOfValue,getThirdNumber,operant3);
//			   	
//			   	System.out.println("---------------------------------");			   	   
//			   	   System.out.println(sumOfValue);
//			   	System.out.println("---------------------------------");
//			   
//
//			   	   System.out.println("enter Fourth Number :");
//			   	   int getFourthNumber=scanner.nextInt();
////			   	   System.out.println(" press 1 -> + 2 -> - 3 -> * 4 -> / ");
////			   	   String operant4=scanner.next();
//			   	   sumOfValue+=getFourthNumber;
//			   	   sumOfValue++;
//			   
			   	   System.out.println(sumOfValue);

			   	   if(sumOfValue!=target) 
			   	   {   leaveinnerpage=leaveinnerpage-1;
			   	       if(leaveinnerpage==0) 
			   	       {
			   	    	   System.out.println("many more Attempt Try another game ");
			   	    	   break inner;
			   	       }
			   		   System.out.println("try Again you enter wrong !! check again");
			   	   }
			   	   
			   	}
				
			}
			
			System.out.println("Your Score is "+scorepoint);
			
		     System.out.println(" leave this game press 0");
		     if(0==scanner.nextInt()) 
		     {
		    	 break;
		     }
		     else 
		     {
		    	 System.out.println("continue next level ");
		     }
		}
		
	}

	private int value(String value) {
		HashMap<String, Integer> operand= new HashMap<String, Integer>();
		operand.put("+", 1);
		operand.put("-", 1);
		operand.put("*", 2);
		operand.put("/", 2);
		operand.put("^", 3);
		operand.put("(", 0);
		operand.put(")", 0);
        
		
		String s=value;
		Stack<String> stack=new Stack<String>();
		String temp="";String result="";
		
		for(int i=0;i<s.length();i++) //aBC
		{                             //+
		   temp=""+s.charAt(i);	    //-
	//	   System.out.println(result);
		   
		   if(temp.equals("+") || temp.equals("-") || temp.equals("/") || temp.equals("*") || temp.equals("^")) 
		   {
	                int pres=operand.get(temp);// / - 2	
            
	                if(stack.size()==0) 
	                 {
	                	 stack.add(temp);//+
//	                	 System.out.println(" stack1 : "+stack);        
	                 }
	                else if(pres<=operand.get(stack.lastElement())) //2<=2
                    {
	            	   for(int j=stack.size()-1;j>=0;j--) //4-0
	                   {
	                         if(pres<=operand.get(stack.get(j))) //2<=2
	                         {
	                                result+=stack.pop();
	                                if(j==0)
	                                stack.add(temp);
	                                
	                         }
	                         else {
	                        	 stack.add(temp);//-
	                        	 break;
	                        	 }
	                   }
	                   
                   }
	               else 
	               {   
	            	   stack.add(temp); // / 
	               }
                  
		   }
		   else if(temp.equals("(")) 
		   {
			   stack.add(temp);
		   }
		   else if(temp.equals(")")) 
		   {         
		        	 
		        	 System.out.println(" stack( : "+stack);                 
		        	 if(temp.equals(")")) 
		        	 {
		        		 for(int j=stack.size()-1;j>=0;j--) 
		        		 {
		        			 if(stack.get(j).equals("(")) 
		        			 {  stack.pop();
		        				break; 
		        			 }
		        			 else {
		        				 result+=stack.get(j);
		        				System.out.println( stack.pop());

		        			      }
		        		 }
		        	 }
		   }
		   else 
		   {
			   result+=s.charAt(i);//3
	
		   }
  
	}
		
		 if(stack.size()!=0) 
         {
        	 for(int j=stack.size()-1;j>=0;j--) 
    		 {
    			 result+=stack.get(j);
    		 }
         }
         
		 System.out.println(result);
	
		 
// Arithmatical operation      	

Stack<Integer> stack1=new Stack<Integer>();
int sum=0;char temp1='\00';

for(int i=0;i<result.length();i++) 
{
   	
         temp1=result.charAt(i);	
    
         if(stack1.size()>=0) 
         {
        
        	 if(temp1=='*' || temp1=='/' || temp1=='+' || temp1=='^' || temp1=='-') 
             {      System.out.println("Check !!!! "+stack1);
             System.out.println("Sum : "+sum);
            	    int a=stack1.pop();
    	            int b=stack1.pop();
            	   switch (temp1) {
    			   case '-': {
    				     
    				     sum=b-a;
    				     stack1.push(sum);
    				break;
    			   }
    			   case '+': {
    				     sum=a+b;
    				     stack1.push(sum);
    				   break;
    				   }
    			   case '/': {
    				     sum=a/b;
    				     stack1.push(sum); 
    				     break;
    				   }
    			   case '^': {
    				     sum=a^b;
    				     stack1.push(sum);
    				     break;
    				   }
    			   case '*': {
    				     sum=a*b;
    				     stack1.push(sum);
    				     break;
    				   }
    			default:
    				throw new IllegalArgumentException("Unexpected value: " + temp1);
    			}   
             }
             else 
             {  int put=Character.getNumericValue(temp1);
             System.out.println(put);
            	 stack1.push(put);
             }

        	 
         }
         
                  
}

System.out.println(sum);
System.out.println();
System.out.println("Final output:");
System.out.println(stack1);		 
		 
	

		
		return sum;
}

	private int ArithmaticOperation(int sumOfNumber, int getNumber, String operant) {
		
		int sum=0,mul=1,sub=0,div=1;
		switch (operant) {
		case "-": {
			System.out.println("call -");
			sub=sumOfNumber-getNumber;
			return sub;
			
		}
		case "+":
		{ 			System.out.println("call +");
			sum=sumOfNumber+getNumber;
		    return sum;
		}
		case "*":{
			System.out.println("call *");
			mul=sumOfNumber*getNumber;
		   return mul;
		}
		case "%":
		{
			System.out.println("call %");
			div=sumOfNumber/getNumber;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operant);
		}
		
	}
	
}
