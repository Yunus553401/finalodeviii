import java.util.Scanner;

public class EnBuyukSayıVeSırasınıBulma {

    public static void main(String[] args) {
        int[] sayilar = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Lütfen " + (i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }
        scanner.close();

        int enBuyukSayi = sayilar[0];
        int enBuyukSayiIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (sayilar[i] > enBuyukSayi) {
                enBuyukSayi = sayilar[i];
                enBuyukSayiIndex = i;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En büyük sayı " + (enBuyukSayiIndex + 1) + ". sırada girildi.");
    }
}
