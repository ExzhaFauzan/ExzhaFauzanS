import java.util.Scanner;
public class GanjilGenap {
    
    public static void main(String [] argr){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan:");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + "bilangan genap.");
        }else{
            System.out.println(bilangan + "bilangan ganjil.");
        }
        input.close();
    }
}
