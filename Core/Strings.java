public class Strings {
    public static void main(String[] args) {
        System.out.println("Strings");

        // String mute = "The string";
        
        // mute.replace("string", "int");

        // System.out.println(mute);

        String str = "A quick brown fox jump over the lazy dog";

        //concat

        String concatString = "Hello " + " Java";
        System.out.println(concatString);

        //cartAt
        System.out.println(str.charAt(6));

        //length
        System.out.println(str.length());

        //replace
        System.out.println(str.replace("quick", "lazy"));

        //substring
        System.out.println(str.substring(14));
        System.out.println(str.substring(14, 22));

        //contains
        System.out.println(str.contains("lazydog"));
        System.out.println(str.contains("lazy dog"));

        //contentEquals
        System.out.println("Hello".contentEquals("Hello"));
        System.out.println("Hello".contentEquals("Byyyy"));

        //equalsIgnoreCase
        System.out.println("Java".equalsIgnoreCase("JAVA"));
    }
}
