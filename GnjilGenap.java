// ...existing code...
import java.util.Scanner;

public class GnjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan sebuah bilangan (integer): ");
            if (!input.hasNextInt()) {
                System.out.println("Input bukan bilangan bulat.");
                return;
            }
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " adalah bilangan genap.");
            } else {
                System.out.println(n + " adalah bilangan ganjil.");
            }
        } finally {
            input.close();
        }
    }
}
// ...existing code...
