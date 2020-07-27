package interview;

import java.util.*;

public class NonRepeatedChar {

	public static void main(String[] args) {
      String str="sahithi";
      char[] ch=str.toCharArray();
      Map<Character,Integer> map=new HashMap<Character,Integer>();
      for(Character c:ch)
      {
    	  if(map.containsKey(c))
    		  map.put(c,map.get(c)+1);
    	  else 
    		  map.put(c, 1);
      }for(Map.Entry m: map.entrySet())
      {
    	  if((Integer)m.getValue()==1)
    	  System.out.println(m.getKey());
      }

	}

}
