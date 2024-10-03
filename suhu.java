import java.util.Scanner;
public class suhu {

    public static void main(String [] argr){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Suhu Dalam Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        input.close();
    }
    
}
