public class AllPatterns {

    public static void pattern1(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        // for (int i = n; i >= 1; i--) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if(i > n) stars = 2*n-i;
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int num = 1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) num = 1;
            else num = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num = 1-num;

            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= 2*i-2; j++){
                System.out.print(" ");
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
            for(int j = n-i+1; j >= 1; j--){
                System.out.print(j);
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
            System.out.println();
        }
    }

    public static void pattern13(int n){
        int count = 1;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print(count+" ");
                count +=1;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for(char j = 'A'; j <= 'A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for (int i = 0; i < n; i++) {
            for(char ch = 'A'; ch < 'A'+n-i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print( (char) ('A'+i));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern1();

        pattern2(5);

        pattern3(8);

        pattern4(5);

        pattern5(5);

        pattern6(5);

        pattern7(5);

        pattern8(5);

        pattern9(7);

        pattern10(5);

        pattern11(5);

        pattern12(5);

        pattern13(5);

        pattern14(5);

        pattern15(5);

        pattern16(5);
    }

    
}
