import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        
        String name = "sourav";
        String sameName = "sourav";
        String newName = new String("sourav");

        String str = "A quick brown fox jump over the lazy dog";

        //equals
        System.out.println(name.equals(newName)); //true

        //equalsIgnoreCase
        System.out.println("Sourav".equalsIgnoreCase(name)); //true

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

        //trim
        System.out.println("   hello  ".trim());

        //startsWith
        System.out.println(str.startsWith("A quick")); //true
        System.out.println(str.startsWith("A quick", 5)); //false -> it check the after offset

        //endswith
        System.out.println(str.endsWith("dog")); //true

        //split
        String[] split1 = str.split(" ");
        System.out.println(Arrays.toString(split1));
        
        String[] split2 = str.split("");
        System.out.println(Arrays.toString(split2));

        //toCharArray

        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));

        //isEmpty
        System.out.println(str.isEmpty());//false
        System.out.println(" ".isEmpty()); //false
        System.out.println("".isEmpty()); //true

        //isBlank
        System.out.println(" ".isBlank()); //true
        System.out.println("".isBlank()); //true
    }
}
