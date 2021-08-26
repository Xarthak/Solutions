/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

class Solution10 {
	public static void main (String[] args) {
		//System.out.println("hello!");
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++){
		    
		    int salary=sc.nextInt();
		    
		    System.out.println(calc(salary));
		    
		    
		}
		
		
	}
	
	public static double calc(int salary){
	    
	    if(salary<1500)
	    return salary*2;
	    
	    else
	    return salary+.98*salary+500;
	    
	    
	}
	
	
}