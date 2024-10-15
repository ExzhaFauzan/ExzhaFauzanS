public class perulangan5 {
    
    public static void main(String [] argr){
        for (int i = 1; i <=6 ; i++){
            if (i % 2 != 0){
                for (int j = 1; j <= (i + 1) / 2; j++){
                    System.out.print("* ");
                }
        }else{
            int angka = 0;
            for (int j = 1; j <= i / 2; j++){
                System.out.print(angka++ + " ");
            } 
        }
    System.out.println();
    
    
    }
    }
}
