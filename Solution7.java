




import java.util.*;
import java.io.*;

class Solution7 {
	public static void main (String[] args) {
		System.out.println("hello!");
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		
		for(int t=0;t<T;t++){
		    
		    int n=sc.nextInt();
		    
		    int[] sticks=new int[n];
		    
		    for(int i=0;i<n;i++){
		        sticks[i]=sc.nextInt();
		    }
		    
		    int result=calc(n,sticks);
		    System.out.println(result);
		    
		}
		
		
		
	}
	
	public static int calc(int n,int[] sticks){
	    
	    
	    TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>(Collections.reverseOrder());
	    
	    for(int i=0;i<n;i++){
	    if(map.containsKey(sticks[i])){
	        
	        increment(map,sticks[i]);
	    }
	    else
	    map.put(sticks[i],1);
	    
	    }
	    int area=1;
	    int flag=0;
	    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
	        if(entry.getValue()>=4){
	           return area*=entry.getKey()*2;
	        }
	        else if(entry.getValue()>=2){
	            area*=entry.getKey();
	            decrement(map,entry.getKey());
	            flag++;
	            if(flag==2)
	            return area;
	           
	        }
	    }
	   if(flag<2) 
	   return -1; 
	   else return area;
	}
	
	 public static void increment(TreeMap<Integer, Integer> map, int key)
    {
        //map.putIfAbsent(key, 0);
        map.put(key, map.get(key) + 1);
    }
	
	public static void decrement(TreeMap<Integer, Integer> map, int key)
    {
        //map.putIfAbsent(key, 0);
        map.put(key, map.get(key) - 2);
    }
	
}