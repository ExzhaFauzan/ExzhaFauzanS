import java.util.Scanner;

public class PangkatDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            hasil += n;
        }

        System.out.println("Hasil pangkat dua dari " + n + " adalah: " + hasil);
    }
}