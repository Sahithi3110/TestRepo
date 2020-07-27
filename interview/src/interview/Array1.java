package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array1 {
	static int makeAnagram(String a, String b) {
        int count1[] = new int[26];  
       int count2[] = new int[26]; 
 
       for (int i = 0; i < a.length() ; i++) 
           count1[a.charAt(i) -'a']++; 
     
       for (int i = 0; i < b.length() ; i++) 
           count2[b.charAt(i) -'a']++; 
 
       int result = 0; 
       for (int i = 0; i < 26; i++) 
           result += Math.abs(count1[i] - 
                              count2[i]); 
       return result; 


   }

	public static void main(String[] args) {
		Integer[] arr1= {4,6,0,2};
		Integer[] arr2= {3,6,1,2};
		//System.out.println(Arrays.stream(arr).max().getAsInt());
		Set<Integer> s1 = new HashSet(Arrays.asList(arr1));
		Set<Integer> s2 = new HashSet(Arrays.asList(arr2));
		s1.retainAll(s2);
		Integer[] result = s1.toArray(new Integer[s1.size()]);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println(makeAnagram(sc.next(),sc.next()));

	}

}
