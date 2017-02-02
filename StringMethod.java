
public class StringMethod {

	public static void main(String[] args) {
	    String HarshKavishwar = "HarshKavishwar";
	    String Kavishwar = "kavishwar";
	    char[] HarshKavishwarArray = HarshKavishwar.toCharArray();
		char[] KavishwarArray = Kavishwar.toCharArray();
	    System.out.println("Substring found : "+isPresent(KavishwarArray, HarshKavishwarArray));
	}

	public static boolean isPresent(char[] Kavishwar, char[] HarshKavishwar) {
	    for (int i = 0; i < HarshKavishwar.length - Kavishwar.length+1; i++) {
	        for (int j = 0; j < Kavishwar.length; j++) {
	            if (HarshKavishwar[i + j] == Kavishwar[j]) {
	                if (j == Kavishwar.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}
}
