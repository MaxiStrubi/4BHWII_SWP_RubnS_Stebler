public class FakEndrekursion {
    public static int Recursion(int n){
        if( n <= 0){
            return -1;
        }
        else{
            return End(1, n);
        }
    }

    public static int End(int m, int n){
        if(n == 0){
            return m;
        }
        else{
            System.out.println(m + " * " + n);
            return End(m * n, n - 1);
        }

    }

    public static void main(String[] args) {

        int n = 6;s
        int result = Recursion(n);
        if(result == -1){
            System.out.println("Eingabe zu niedrig");
        }
        else{

            System.out.println("Ergebnis = "+result);
        }


    }









}