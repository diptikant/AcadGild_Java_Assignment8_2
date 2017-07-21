package java_Assignment82;
/*
 * Implement a class that checks whether a given number is a prime 
 * using both the Thread class and Runnable interface
 */

import java.util.Scanner;
public class Java_Assignment8_2 
{
	public static void main(String[] args) 
	{		
		int n;
		Scanner in = new Scanner(System.in); //Initializing the Scanner class
		System.out.println("Enter number :");
		n = in.nextInt(); //Accepting the user input
		new NewThread(n);//Making an instance of the newthread class with the int parameter
		in.close(); //Closing of the scanner object

	}

}


class NewThread implements Runnable // class implements runnable interface
{
	Thread t1; // thread class instance
	int no1;
	NewThread() // default Constructor
	{
		no1=11 ;
	    t1=new Thread(this,"Prime number");	     
	    t1.start(); //Starting the first thread
	}
	NewThread(int pam) // Constructor with a int parameter
	{
		no1=pam;
	    t1=new Thread(this,"Prime number");	    
	    t1.start(); //Starting the first thread
	}
	//This method will be executed when this thread is executed
	public void run()
	{
	   
		try 
		{
			int no=no1;
	        int cnt=0;
	        //loop for checking the number is prime or not
	        for(int i=2;i<=no/2;i++)
	        {
		         if(no%i==0)
		         {
			         cnt++;
			         break;
		         }
	        }
	         if(cnt==0)
	             System.out.println(no+" Number is a prime");
	         else
	        	 System.out.println(no+" Number is not a prime");
	 
		     Thread.sleep(1000);
		}
	    catch(InterruptedException e)
		{
	    	/*Interrupted exception will be thrown when a sleeping or waiting
             * thread is interrupted.
             */
	    	System.out.println("Exception");  
		}
	}
}
