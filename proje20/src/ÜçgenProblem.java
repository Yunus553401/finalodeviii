import java.util.Scanner;

public class ÜçgenProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğunu Girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. Kenar Uzunluğunu Girin: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("3. Kenar Uzunluğunu Girin: ");
        double kenar3 = scanner.nextDouble();

        if (ucgenMi(kenar1, kenar2, kenar3)) {
            System.out.println("Bu kenar uzunlukları bir üçgen oluşturur.");

            if (eskenarMi(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen bir eşkenar üçgendir.");
            } else if (ikizkenarMi(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen bir ikizkenar üçgendir.");
            } else {
                System.out.println("Bu üçgen bir çeşitkenar üçgendir.");
            }
        } else {
            System.out.println("Bu kenar uzunlukları bir üçgen oluşturmaz.");
        }

        scanner.close();
    }

    public static boolean ucgenMi(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static boolean eskenarMi(double a, double b, double c) {
        return a == b && b == c;
    }

    public static boolean ikizkenarMi(double a, double b, double c) {
        return a == b || b == c || a == c;
    }

}
