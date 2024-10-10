import java.util.Scanner;
public class Lulus {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Anda:");

        int nilai = input.nextInt();
        if (nilai > 78) {
            System.out.println("Mantap Bro Lo Lulus!");
        }else{
            System.out.println("Sorry Bro Lo Ga Lulus.");
        }
        input.close();
    }
}
