import java.util.Scanner;

public class SayısalOranBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        scanner.close();

        double oran = sayi1 / sayi2;

        System.out.println("Sayısal Oran: " +oran);

    }

}