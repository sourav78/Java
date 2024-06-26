import java.util.HashMap;

public class CharacterHashing {

    public static int[] lowercaseCharHashing(String s){
        int[] ch = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a'] += 1;
        }

        return ch;
    }

    public static int[] CharHashing(String s){
        int[] hashArr = new int[256];

        for(int i = 0; i < s.length(); i++){
            hashArr[s.charAt(i)] += 1;
        }

        return hashArr;
    }

    //Character hashing using hashmap
    public static HashMap<Character, Integer> CharHashingUsingHashMap(String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(hashMap.get(str.charAt(i)) == null){
                hashMap.put(str.charAt(i), 1);
            }else{
                hashMap.replace(str.charAt(i), hashMap.get(str.charAt(i))+1);
            }
        }

        return hashMap;
    }


    public static void main(String[] args) {


        // String str = "helloiamjulu";

        // int[] hashArr = lowercaseCharHashing(str);

        // System.out.println(hashArr['w' - 'a']);
        // System.out.println(hashArr['u' - 'a']);


        String str = "Hello c daj^sfba 09uq3w h23h09u fnd swdeug%hbdj(v^w 383) 2^3";

        int[] hashArr = CharHashing(str);

        System.out.println(hashArr['w']);
        System.out.println(hashArr['u']);
        System.out.println(hashArr[')']);

        System.out.println("Hashmap");

        //HasMap
        HashMap<Character, Integer> hashedMap = CharHashingUsingHashMap(str);
        System.out.println(hashedMap.getOrDefault('c', 0));
        System.out.println(hashedMap.getOrDefault('^', 0));
        System.out.println(hashedMap.getOrDefault('Q', 0));
        System.out.println(hashedMap.getOrDefault(' ', 0));
    }
}
