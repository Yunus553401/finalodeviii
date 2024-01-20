import java.util.Scanner;


    public class YildizPiramidi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Piramidin yüksekliğini girin: ");
            int yukseklik = scanner.nextInt();

            piramitCiz(yukseklik);

            scanner.close();
        }

        public static void piramitCiz(int yukseklik) {
            for (int i = 0; i < yukseklik; i++) {
                for (int j = 0; j < yukseklik - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }

                // Bir sonraki satıra geç
                System.out.println();
            }
        }

    }