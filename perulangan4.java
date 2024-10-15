public class perulangan4 {
    public static void main (String [] argr){
        int baris=4;
        int kolom=5;

        for (int i = 1; i <= baris; i++){
            for (int j = 1; j <= kolom; j++){
                if ((i + j) % 2 == 0){
                System.out.print("-1 ");
                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
