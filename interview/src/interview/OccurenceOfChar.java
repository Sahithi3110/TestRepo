package interview;

public class OccurenceOfChar {

	public static void main(String[] args)
	{
		String str="sahithi is a developer at Morgan Stanly a a a a a";
		int count=0;
		char[] ch=str.toCharArray();
		for(char s:ch)
		{
		switch(s)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':count++;
			default:
			break;
		}
		}System.out.println(count+" Vowels in the given String");
	}
}
