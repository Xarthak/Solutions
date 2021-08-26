//ALGORITHM

//1)take the inputs
//2)validate the inputs
//3)find atleast one skill that can be distinctly ordered. if no skill can be ordered print no
//4)check if the (i-1)th student has skill greater than ith student then print no
//5)else print yes

import java.util.*;
import java.io.*;

class Solution1 {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int s1[]=new int[3];
		int s2[]=new int[3];
		int s3[]=new int[3];
		
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++){
		    
		    for(int i=0;i<3;i++){
		        s1[i]=sc.nextInt();
		        s2[i]=sc.nextInt();
		        s3[i]=sc.nextInt();
		    }
		    calc(s1,s2,s3);
		   
		}
		
	}
	
	//takes the sorted order and checks that no skill from the student below in order is greater then current student
	public static void calc(int[] s1,int[] s2,int[] s3){
	   
	   
	   
	   // for(int i=0;i<3;i++)
	   // System.out.println(s1[i]+" "+s2[i]+" "+s3[i]);
	      
	    int[] order= sort(s1); 
	    if(order==null)
	       order=sort(s2);
	            if(order==null)
	                order=sort(s3);
	                
	    if(order==null)
	    System.out.println("no");
	                
	    
	      
	      else{
	          //System.out.println(order[0]+" "+order[1]+" "+order[2]);
	          int flag=1;
	          for(int i=2;i>0;i--){
	              int current=order[i];
	              int next=order[i-1];
	              
	              if(!(s1[current]>=s1[next] && s2[current]>=s2[next] && s3[current]>=s3[next])){
	                  flag=0;
	              }
	              
	          }
	          
	          if(flag==0)
	          System.out.println("no");
	          else
	          System.out.println("yes");
	          
	          
	          
	      }
	    
	    
	}
	
	//returns an order of points in accesding order
	//if no accesding order exists reurns null
	public static int[] sort(int[] s){
	    int[] temp={1,2,3};//test delete later
	    int[] order=new int[3];
	    
	   if(s[0]==s[1] ||s[1]==s[2] || s[2]==s[0])
	    {
	        return null;
	    }
	    else{
	        
	        if(s[0]<s[1] && s[0]<s[2]){
	         order[0]=0; 
	         if(s[1]<s[2]){
	             order[1]=1;
	             order[2]=2;
	         }else{
	             order[1]=2;
	             order[2]=1;
	         }
	        }
	        else if(s[1]<s[0] && s[1]<s[2]){
	            order[0]=1;
	            if(s[0]<s[2]){
	             order[1]=0;
	             order[2]=2;
	         }else{
	             order[1]=2;
	             order[2]=0;
	         }
	        }
	        
	        //outer else
	        else{
	            order[0]=2;
	            if(s[0]<s[1]){
	             order[1]=0;
	             order[2]=1;
	         }else{
	             order[1]=1;
	             order[2]=0;
	         }
	        }
	   return order;      
	    }
	}
	
	
	
	
}
