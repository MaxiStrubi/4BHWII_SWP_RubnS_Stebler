public class SumIterativ {

    public static int sum(int n){
        int z = 0;
        if(n ==1){
            return 1;
        }else{

            for(int i = 0;i<=n;i++){
               z=z+i;
            }
            return z;
        }


    }

    public static void main(String[] args) {
        int zahl  = 6;
        int result = sum(zahl);
        if(result == 1){
            System.out.println("Eingabe zu niedrig");
        }
        else{

            System.out.println("Ergebnis = "+result);
        }
    }
}
