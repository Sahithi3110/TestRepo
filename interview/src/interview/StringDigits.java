package interview;

import java.util.regex.Pattern;

public class StringDigits {
public static void main(String[] args)
{
	String str="274546564";
	char[] ch=str.toCharArray();
	int count=0;
	for(char c:ch)
	{
	if(Character.isDigit(c))
		count++;
	}System.out.println("Given String contains "+count+" numbers");
	if(Pattern.matches("[0-9]",str))
	System.out.println("Allmatched");
	else System.out.println("Not matchd");
		
}
}
