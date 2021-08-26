

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
    		    min = Math.min(min, sc.nextInt());
    		}
    		System.out.println(min * (l - 1));
		}
	}
}