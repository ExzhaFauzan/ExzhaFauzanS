import java.util.Scanner;
public class PersegiPanjang {
    public static void main(String [] argr){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang Persegi Panjang : ");
        double panjang = input.nextDouble();

        System.out.print("Masukan Lebar: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:"+ luas);
        input.close();

    }
}
