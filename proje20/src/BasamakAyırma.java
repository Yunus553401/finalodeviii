import java.util.Scanner;

public class BasamakAyırma {
    static void basamaklaraAyir(int sayi) {

        int temp = sayi;
        int basamakSayisi = 0;

        while (temp > 0) {
            temp /= 10;
            basamakSayisi++;
        }
        System.out.println(sayi + " sayısının " + basamakSayisi + " basamağı vardır.");

        temp = sayi;
        System.out.print("Basamaklar: ");
        for (int i = basamakSayisi - 1; i >= 0; i--) {
            int basamakDegeri = (int) (temp / Math.pow(10, i));
            System.out.print(basamakDegeri + " ");
            temp %= Math.pow(10, i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        basamaklaraAyir(sayi);
    }

}
