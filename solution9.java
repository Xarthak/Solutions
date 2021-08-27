//ALGORITHM

//1)take input
//2)validate inputs
//3)find the smallest element
//4)multiply the smallest element by length-1

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution9{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t --> 0) {
		  
            int length = sc.nextInt();
            long min = sc.nextInt();
		    int l = length;
    		while ( length --> 1) {
    		    //finding the min
    		    min = Math.min(min, sc.nextInt());
    		}
    		System.out.println(min * (l - 1));
		}
	}
}