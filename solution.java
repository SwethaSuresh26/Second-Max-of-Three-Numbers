/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int max = Math.max(Math.max(a,b),c);
		    
		    if(max==a){
		        int secmax=Math.max(b,c);
		         System.out.println(secmax); 
		    }
		    else if(max==b){
		       int  secmax=Math.max(a,c);
		        System.out.println(secmax); 
		    }
		    else if(max==c){
		        int secmax=Math.max(b,a);
		         System.out.println(secmax); 
		    }
		    else{
		        System.out.println("error");
		    }
		  
		}
		
	}
}
