//ALGORITHM
//1)take inputs
//2)validate inputs
//3)call the calc function return yes or no
//4)calculate the max number of legs possible that is when all cats are on the ground 
// max=dogs*4 + cats*4;
//5)cats legs are hidden when they sit on dogs, calculate max cats that can be hidden
//as maxHidden=dogs*2
//6)minCats=cats-maxHidden
//7)if minCats<0 minCats=0, cause it cant be negative
//8)check if legs lies between the interwal min<= legs <=max

import java.util.*;
import java.io.*;

class Solution6 {
	public static void main (String[] args) {
		System.out.println("hello!");
		Scanner sc=new Scanner(System.in);
		boolean invalid=false;
		
		int T=sc.nextInt();
		if(T<1 || T>105)
		invalid=true;
		
		for(int t=0;t<T;t++){
		    int cats=sc.nextInt();
		    int dogs=sc.nextInt();
		    int legs=sc.nextInt();
		    
		    if(cats<0 || cats>109 ||dogs<0 || dogs>109 || legs<0 || legs>109)
		    invalid=true;
		    
		    if(invalid){
		        System.out.println("Invalid Input");
		        return;
		    }
		    
		    String result=calc(cats,dogs,legs);
		    System.out.println(result);
		    
		}
		
			
	}
	
	
	public static String calc(int cats,int dogs,int legs){
	    
	    int max= dogs*4 +cats*4;
	    
	    int temp=cats-dogs*2;
	    int minCats=temp;
	    if(minCats<0)
	    minCats=0;
	    
	    int min=dogs*4 +minCats*4;
	    
	    if(legs>=min && legs<=max)
	    return "yes";
	    
	    else return "no";
	    
	    
	}
	
	
}