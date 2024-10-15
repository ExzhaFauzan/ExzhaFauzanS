public class perulangan3 {
    public static void main(String [] argr){
        int angka =1;
        int baris =4;
        int kolom =5;
        
        for(int i = 1; i <= baris; i++){
            if (i % 2 !=0){
                for(int j = 0; j < kolom; j++){
                    System.out.print(angka++ + " ");
                }
            }else{
                int temp = angka + kolom - 1;
                for (int j = 0; j < kolom; j++){
                    System.out.print(temp-- + " ");
                }
                angka += kolom;
            }
            System.out.println();
        }
    }
}