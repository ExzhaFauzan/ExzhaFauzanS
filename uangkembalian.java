import java.util.Scanner;
public class uangkembalian {
 
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        Double totalBelanja = 70000.0;
        System.out.print("Masukan uang anda: ");
        int uangBayar  = inputan.nextInt();

        Double uangkembalian = uangBayar - totalBelanja;
        inputan.close();
        System.out.printf("uang kembalian : %.2f", uangkembalian);
    }
}


