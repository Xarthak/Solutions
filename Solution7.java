//ALGORITM

//1)take the inputs 
//2)validate the inputs
//3)call th calc method
//4)Enter all the sides as key and their value as 1 in TreeMap, if key dosent exist.
//5)if side exist in TreeMap then increment the value of treemap
//6)for us to create a triangle sucessfully, we need 2 side pairs
//7)we have set the TreeMap to reverseOrder,thus its always sorted in decending order of keys
//8)pick the 1st 2 pairs occuring in TreeMaps as they are largest




import java.util.*;
import java.io.*;

class Solution7 {
	public static void main (String[] args) {
	//	System.out.println("hello!");
		
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
	    
	    //enter all the sides as key in map,value represents no of occurences
	    for(int i=0;i<n;i++){
	    if(map.containsKey(sticks[i])){
	        increment(map,sticks[i]);
	    }
	    else
	    map.put(sticks[i],1);
	    }
	    int area=1;
	    int flag=0;
	    
	    //find 2 instances where value=2
	    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
	        //if value =4 we can form a square
	        if(entry.getValue()>=4){
	           return area*=entry.getKey()*2;
	        }
	        //find instance where value=2, decrement valueby2 and increment flag
	        else if(entry.getValue()>=2){
	            area*=entry.getKey();
	            decrementby2(map,entry.getKey());
	            flag++;
	            if(flag==2)
	            return area;
	           
	        }
	    }
	   if(flag<2) 
	   return -1; 
	   else return area;
	}
	
	//increments the value at given key by 1
	 public static void increment(TreeMap<Integer, Integer> map, int key)
    {
        //map.putIfAbsent(key, 0);
        map.put(key, map.get(key) + 1);
    }
	
	//decerements the value at given key by 2
	public static void decrementby2(TreeMap<Integer, Integer> map, int key)
    {
        map.put(key, map.get(key) - 2);
    }
	
}