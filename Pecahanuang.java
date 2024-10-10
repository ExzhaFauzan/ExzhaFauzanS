import java.util.Scanner;
public class Pecahanuang {
    public static void main(String [] argr){
    Scanner input = new Scanner(System.in);

    System.out.print("masukan uang");
    int uang = input.nextInt();

    int seratusRibu = uang / 100000;
    uang = uang % 100000;
    int limaPuluhRibu = uang / 50000;
    uang = uang % 50000;
    int duaPuluhRibu = uang / 20000;
    uang = uang % 20000;
    int sepuluhRibu = uang / 10000;
    uang = uang % 10000;
    int limaRibu = uang / 5000;
    uang = uang % 5000;
    int duaRibu = uang / 2000;
    uang = uang % 2000;
    int seribu = uang / 1000;
    uang = uang % 1000;
    int limaRatus = uang / 500;
    uang = uang % 500;
    int seratus = uang / 100;
    if (seratusRibu > 0){
        System.out.println(seratusRibu + " lembar 100 ribuan");
    } if (limaPuluhRibu > 0){
        System.out.println(limaPuluhRibu + " lembar 50 ribuan");
    }if (duaPuluhRibu > 0){
        System.out.println(duaPuluhRibu + " lembar 20 ribuan");
    }if (sepuluhRibu > 0){
        System.out.println(sepuluhRibu + " lembar 10 ribuan");
    }if (limaRibu > 0){
        System.out.println(limaRibu + " lembar 5 ribuan");
    }if (duaRibu > 0){
        System.out.println(duaRibu + " lembar 2 ribuan");
    }if (seribu > 0){
        System.out.println(seribu + " lembar 1 ribuan");
        if (limaRatus > 0){
            System.out.println(limaRatus + " Koin 500  ");
            if (seratus > 0){
                System.out.println(seratus + " Koin 100 ");
                input.close();
            }
        
        }
    
    }







}
}