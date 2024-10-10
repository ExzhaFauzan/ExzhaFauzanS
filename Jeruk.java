import java.util.Scanner;
public class Jeruk {
    public static void main(String [] argr){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah jeruk yang dibeli: ");
        int jumlahJeruk = input.nextInt();
        int totalHarga = 0;
        while (jumlahJeruk > 0){
            if (jumlahJeruk >= 5){
                totalHarga += 5000;
                jumlahJeruk -= 5;
            } else if (jumlahJeruk >= 2){
                totalHarga += 5000;
                jumlahJeruk -= 2;
            }else{
                totalHarga += 3000;
                jumlahJeruk -= 1;
            }
        }
        System.out.println("Total yang harus saya bayar: Rp " + totalHarga);
        input.close();
    }
}
