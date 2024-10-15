public class perulangan2 {
    
    public static void main(String [] argr){
        int angka =1;
        int baris =4;
        int kolom =5;
        for(int i = 1; i <= baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.print(angka++ + " ");
            }
            angka++;
            System.out.println();
        }
    }
}
