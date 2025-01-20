public class logic6 {
    public static void main (String[] args){
        int i, j, n = 5;

        for(i = 1; i <= n;i++){
            for(j = n - i; j > 0;j--){
                System.out.print(" ");
            }
            for(j = 1;j <= i * 2 - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
