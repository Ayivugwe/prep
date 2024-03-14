public class Palindrome {
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
    
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("The string to verify if palyndrome is: "+str);
        System.out.println(isPalindrome(str));
    }
}
