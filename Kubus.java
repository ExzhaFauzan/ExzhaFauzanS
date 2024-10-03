import java.util.Scanner;
public class Kubus {
    public static void main(String [] argr){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Panjang Sisi:");
        double sisi = input.nextDouble();

        double volume = Math.pow(sisi, 3);
        System.out.println("Volume Kubus: " + volume);
        input.close();

    }
}
