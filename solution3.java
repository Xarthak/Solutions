//ALGORITHM

//1)take the inputs
//2)validate the inputs
//3)for every strip call the calc method
//4)if Ni(n) is even then it has no centre thus calc returns "no"
//5)check if the starting height and the ending height are 1
//6)check if height increase is 1 as we move towards centre


import java.util.*;
import java.io.*;

class Solution3 {
    
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int invalid=0;
		int S=sc.nextInt();
		if(S<1 || S>100)
		 invalid=1;
		
		
		
		for(int s=0;s<S;s++){
		   int n=sc.nextInt();
		   if(n<1 || n>100)
		     invalid=1;
		   int[] height=new int[n];
		   for(int i=0;i<n;i++){
		       height[i]=sc.nextInt();
		       if(height[i]<1 || height[i]>100)
		         invalid=1;
		       
		   }
		   //if constraints are violated invalid is set to 1
		   if(invalid==1){
		       System.out.println("Invalid input");
		       return;
		   }
		   
		   
		   
		  String output = calc(n,height);
		   
		  System.out.println(output);
		   
		}//end of Strips loop
		
	}
	
	
	public static String calc(int n, int[] height){
	    
	    
	    //check if even, if even it wont have a center 
	    //and check if starting height and ending height is 1
	    if(n%2==0 || height[0]!=1 || height[n-1]!=1)
	    return "no";
	    
	    else{
	        
	        for(int i=1,j=n-2;i<=n/2;i++){
	            //if the change in height as we move towards centre is not 1 then return no
	            if(height[i]-height[i-1]!=1 && height[j+1]-height[j]!=1)
	            return "no";
	        }
	        return "yes";
	    }
	    
	    
	    
	}

	
}



