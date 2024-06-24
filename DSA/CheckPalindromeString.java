public class CheckPalindromeString {

    static boolean checkPalindrome(int i, String str){
        if(i >= str.length()/2) return true;

        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;

        return checkPalindrome(i+1, str);
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(0, "madam"));
        System.out.println(checkPalindrome(0, "Hello"));
        System.out.println(checkPalindrome(0, "a man a plan a canal panama"));

        String j = "";
        System.out.println(j.length());
    }
}
