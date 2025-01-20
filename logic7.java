public class logic7 {
    public static void main(String[] ars){
        int i, j, n = 5;

        for(i = 1; i <= n; i++){
            for(j = 1; j <= n;j++){
                if(j == i|| j == (n - i + 1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
