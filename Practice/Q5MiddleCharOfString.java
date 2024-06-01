
public class Q5MiddleCharOfString {
    public static void main(String[] args) {
        System.out.println(getMiddleChar("Hyy i am julu"));
        System.out.println(getMiddleChar("What are youu doing here"));
    }

    public static String getMiddleChar(String str){
        
        String[] strArr = str.split("");

        String middleChar = strArr.length % 2 != 0 ? strArr[strArr.length/2] : strArr[strArr.length/2-1]+strArr[strArr.length/2];

        return middleChar;
        
    }
}
