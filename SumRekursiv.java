public class SumRekursiv {

    public static int sum(int n){

        if (n == 1){
            return 1;
        } else {
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {
        int zahl  = 3;
        //zahl = zahl -1;
        //Rekursiv
        int result = sum(zahl);
        if(result == 1){
            System.out.println("Eingabe zu niedrig");
        }
        else{

            System.out.println("Ergebnis = "+result);
        }
    }
}
