/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution5{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    HashSet<Integer> h = new HashSet<>();
		    int count1=0,countminus1=0;
		    int flag = 0;
		    int diff = 0;
		    for(int i=0;i<n;i++){
		        int x =scan.nextInt();
		        if(x==1)
		        count1++;
		        else if(x==-1)
		        countminus1++;
		        else if(x<=-2 || x>=2){
		            diff = x;
		            flag++;
		        }
		    }
		    if(flag>1){
		        System.out.println("no");
		    }
		    else{
		        if(flag==1 && countminus1>0){
		            System.out.println("no");
		        }
		        else if(countminus1>1 && count1==0){
		            System.out.println("no");
		        }
		        else{
		            System.out.println("yes");
		        }
		    }
		}
	}
}
