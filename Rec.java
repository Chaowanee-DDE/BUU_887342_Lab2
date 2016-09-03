public class Rec {


    /** = number of the digits in the decimal representation of n.
		e.g. numDigits(0) = 1, numDigits(3) = 1, numDigits(34) = 2.
		numDigits(1356) = 4.
		Precondition: n >= 0. */
    public static int numDigits(int n) {
	
	// fill me in
	if((n<10) && (n>-10)) return 1;
	return 1 + numDigits(n/10);
    }

    public static int sumDigits(int n) {
	
	// fill me in
	
    }
	
    /** = a copy of s with to_remove_char removed.
		Example: removeChar("abeabe", 'e') = "abab". */
	public static String removeChar(String s, char to_remove_char) {
	
	// fill me in
	
	}
	
    /** = a copy of s with characters in reverse order.
		Example: reverse("abcdefg") = "gfedcba". */
	public static String reverse(String s) {
		
		if (s.length() == 0) return "";
		return reverse(s.substring(1)) + String.valueOf(s.charAt(0));
	
	}

    public static void main(String[] args) {
        System.out.println(numDigits(123));
        System.out.println(numDigits(123456));
        System.out.println(numDigits(1));
        System.out.println(numDigits(0));
        System.out.println("-----------------");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(123456));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(0));
		System.out.println("-----------------");
		System.out.println(removeChar("eawabbcceccddeeaaeeeee", 'e'));
		System.out.println(removeChar("acacacacac", 'a'));
		System.out.println("-----------------");		
		System.out.println(reverse("aaabbbaccabda"));
        System.out.println(reverse("abbcccdeaaa"));
		System.out.println(reverse("AMANAPLANACANALPANAMA"));
    }
}
