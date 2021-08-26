import java.util.*;
import java.io.*;

class Solution11 {
	public static void main (String[] args) {
		//System.out.println("hello!");
		Scanner sc=new Scanner(System.in);
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("b","BattleShip");
		map.put("c","Cruiser");
		map.put("d","Destroyer");
		map.put("f","Frigate");
		
		int T=sc.nextInt();
		
		while(T -->0){
		    
		    String ch=sc.next();
		  
		    System.out.println(map.get(ch.toLowerCase() ) );
		}
		
		
		
	}
}