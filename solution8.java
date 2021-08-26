//ALGORITHM
//1)take the inputs
//2)validate the inputs
//3)call the calc function
//4)if n is even both a,b get multiplied by (n*2)/2 effectively n
//5)if n is odd b gets 1 less play,thus divide b by 2
//6)find max divide by min and return

import java.util.*;
import java.io.*;

class Solution8 {
	public static void main (String[] args) {
		//System.out.println("hello");
		
		Scanner sc=new Scanner(System.in);
		
		
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++){
		    int alice=sc.nextInt();
		    int bob=sc.nextInt();
		    int n=sc.nextInt();
		    
		    int result= calc(alice,bob,n);
		    System.out.println(result);
		    
		}
		
		
	}
	
	public static int calc(int a,int b,int n){
	    //System.out.println("b"+b);
	    int finalA=0,finalB=0;
	     finalA=a*n;
	     finalB=b*n;
	    if(a%2!=0)
	    finalB/=2;
	    
	    if(finalA>finalB)
	    return finalA/finalB;
	    
	    else return finalB/finalA;
	    
	}
	
	
}