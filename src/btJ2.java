import java.util.Scanner;

public class btJ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so");
        int number = input.nextInt();
        String result = "";
        int donVi = number % 10;
        int chuc = (number / 10) % 10;
        int tram = number / 100;
        if (tram != 0) {
            result = result + getString(tram);
            result = result + "tram";
        }
//        System.out.println(chuc);
//        System.out.println(donVi);
        if (chuc != 0) {
            result = result + getString(chuc);
            result = result + "muoi";
        }
        result = result + getString(donVi);
        System.out.println(result);
    }

    public static String getString(int number) {
        switch (number) {
            case 1:
                return "Mot";
            case 2:
                return "High";
            case 3:
                return "Bar";

        }
        return null;
    }
}
