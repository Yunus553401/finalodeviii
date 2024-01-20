import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DogumGunu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen doğum tarihinizi gün ay yıl şeklinde girin: ");
        String dogumTarihiStr = scanner.nextLine();
        scanner.close();

        SimpleDateFormat tarih = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date dogumTarihi = tarih.parse(dogumTarihiStr);


            SimpleDateFormat gun = new SimpleDateFormat("EEEE");
            String dogumGun = gun.format(dogumTarihi);


            System.out.println("Doğduğunuz gün: " + dogumGun);
        } catch (ParseException e) {
            System.out.println("Geçersiz tarih girişi. Lütfen gün ay yıl şeklinde girin.");
        }

    }
}