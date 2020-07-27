package interview;

public class String1 {

	
	 
	public static String reverseRecursively(String str) {
 
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
		 String str="poo";
		// System.out.println(str.length());
		 System.out.println(reverseRecursively(str));
	}

}
