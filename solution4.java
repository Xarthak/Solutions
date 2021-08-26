//ALGORITHM

//1)take the inputs
//2)validate the inputs
//3)call the calc method for each test case 
//4)iterate through the food String (foods that he has eaten)
//5)check if the cookieflag is set true.
//6)If true then, the food hes eating right now should be milk
//7)if food is milk set cookieflag to false
//8)if he eats a cookie set the cookieflag to true.
//9)if cookieflag is set to true and he eats a cookie again, then break
//10)after the loop if cookieflagis set to true, then return "NO", else return "YES".
    


import java.util.*;
import java.io.*;

class Solution4 {
    
	public static void main (String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		boolean invalid=false;
		int T=sc.nextInt();
		if(T<1 || T>50)
		invalid=true;
		
		for(int t=0;t<T;t++){
		    
		    int n=sc.nextInt();
		    if(n<1 || n>50)
	    	invalid=true;
	    	
		    String[] food=new String[n];
		    String cookie="cookie";
		    String milk="milk";
		    
		    for(int i=0;i<n;i++){
		        food[i]=sc.next();
		        if(!(food[i].equals(milk) || food[i].equals(cookie))){
		        invalid=true;
		        
		        }
		    }
		    
		    //check if invalid is set to true
		    if(invalid){
		    System.out.println("Invalid input");
		    return;
		    }
		    
		  String result=calc(n,food);
		  System.out.println(result);
		    
		}
		
	}
	

//returs YES or NO
	public static String calc(int n, String[] food){
	    boolean cookieFlag=false;
	   
	    
	    
	    for(int i=0;i<n;i++){
	        
	        if(cookieFlag==true){
			
	            if((food[i].equals("milk") ))
	            {
			//if food eaten after cookieflag=true is milk then set cookieflag=false
	                cookieFlag=false;
	            }
	            else
	            break;
	        }
		//if eaten food is cookie set cookieflag to true
	        if(food[i].equals("cookie")){
	           cookieFlag=true;
	        }
	        
	    }
	    
	    
	    if(cookieFlag)
	    return "NO";
	    else 
	    return "YES";
	    
	}
	
	
	
}