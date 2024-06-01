public class CountWords {
    public static void main(String[] args) {
        System.out.println(count("The quick brown fox jumps over the lazy dog."));
        System.out.println(count("the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical."));
    }

    public static int count(String str){
        return str.split(" ").length;
    }
}
