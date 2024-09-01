import java.util.Scanner;

public class AddharPanDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AdhharService adhharService = new AdhharService();
        PanService panService = new PanService();

        System.out.println("Enter Aadhaar Number:");
        String addharNumber = sc.nextLine();

        Addhar addhar = adhharService.getAddharByNumber(addharNumber);
        Pan pan = panService.getPanByAddharNumber(addharNumber);

        if (addhar == null || pan == null){
            System.out.println("No Match found...");
            return;
        }

        System.out.println("Addhar : " + addhar);
        System.out.println("Pan : " + pan);
    }
}
