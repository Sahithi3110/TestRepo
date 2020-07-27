package interview;

public class PalinDrome {

	public static void main(String[] args) {
		String str="mam";
		
		StringBuffer b=new StringBuffer(str);
		if(str.equalsIgnoreCase(b.reverse().toString()))
			System.out.println("PalinDrome");
		else 
			System.out.println("Noooo");

	}

}
