import java.util.Scanner;
public class lingkaran {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jari Jari Lingkaran :");
        double jariJari = input.nextDouble();

        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
        input.close();
    }
}
