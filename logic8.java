public class logic8{
    public static void main(String[] args) {
        int i, j, n = 5;
        
        for(i = n / 2; i <= n; i += 2){
            for(j = 1;j < n - i; j+=2){
                System.out.print(" ");
            }
            for(j = 1;j <= i;j++){
                System.out.print("*");
            }
            for(j = 1;j <= n - i;j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(i = n; i >= 1; i--){
            for (j = n - i; j > 0; j--){
                System.out.print(" ");
            }
            for(j = 1;j <= (i * 2) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
