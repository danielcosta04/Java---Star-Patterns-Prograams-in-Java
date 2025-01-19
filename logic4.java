public class logic4 {
    public static void main(String[] args) {
        int n = 5, i, j;

        for(i = 1; i <= n;i++){
            for(j = n - i; j > 0; j--){
                System.out.print(" ");
            }
            for(j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(i = n - 1; i >= 1; i--){
            for(j = n - i; j > 0; j--){
                System.out.print(" ");
            }
            for(j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
