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
	    
	   // System.out.println("a>"+finalA+"b>"+finalB);
	    if(finalA>finalB)
	    return finalA/finalB;
	    
	    else return finalB/finalA;
	    
	}
	
	
}