import java.util.Scanner;
public class konversi {
    public static void main(String [] argr){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai:");
        int nilai = input.nextInt();

        if (nilai > 85){
            System.out.println("Nilai Anda: A");
        }else if (nilai > 75 && nilai <= 85){
            System.out.println("Nilai Anda: B ");
        }else if (nilai > 65 && nilai <= 75){
            System.out.println("Nilai Anda: C");
        }else if (nilai > 55 && nilai <= 65){
            System.out.println("Nilai Anda: D");
        }else {
            System.out.println("Nilai Anda: E");
        }
        input.close();
    }
}
