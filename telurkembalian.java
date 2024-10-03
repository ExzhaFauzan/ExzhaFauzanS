import java.util.Scanner;
public class telurkembalian {
    
    public static void main(String [] args){
        final double hargaPerKilo = 28000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Jumlah Telur (kg) :");
        double jumlahTelur = scanner.nextDouble();

        System.out.print("Masukan Jumlah Yang Dibayarkan: ");
        double uangDibayar = scanner.nextDouble();

        double totalBayar = jumlahTelur + hargaPerKilo;
        double kembalian = uangDibayar - totalBayar;

        System.out.println("Jumlah Telur(Kg) : " + jumlahTelur + "Kilo");
        System.out.println("Total Bayar : " + totalBayar);
        System.out.println("Uang Kembalian : "+ kembalian);

        scanner.close();






    }
}
