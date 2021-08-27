//ALGORITHM
//1)take the inputs
//2)validate the inputs
//3)we create a frequency array to store the frequency of arrival of every Character
//4)create an HashSet to store and to avoid duplicate values
//5)add value in a set and subsequently increase its frequency
//6)sort the frequency array
//7)check for all i>2 freq[i]=freq[i-1]+freq[i-2]

import java.util.*;
import java.util.*;
class Solution1{
	public static void main(String args[]) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		if(t<1 || t>10){
		    System.out.println("Invalid Input");
		    return ;
		}
		
		for(int test=0;test<t;test++)
		{
			String s=scan.next();
			int n=s.length();
			int freq[]=new int[26];
			HashSet<Character> set=new HashSet<Character>();
			for(char c:s.toCharArray())
			{
				set.add(c);
				freq[c-97]++;
			}
			if(set.size()<3)
			{
				System.out.println("Dynamic");
				continue;
			}
			Arrays.sort(freq);
			int flag=0;
			
			for(int i=26-set.size()+2;i<26;i++)
			{
		
				if(freq[i]!=freq[i-1]+freq[i-2])
				{
					System.out.println("Not");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Dynamic");
		}
	}
}
