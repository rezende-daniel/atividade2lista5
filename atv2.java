package atv2;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o  número ");
        int n = entrada.nextInt();
        entrada.close();
        imprimeNuemros(n);
    }
        

        static void imprimeNuemros (int n) {
             for (int i = 1; i <= n; i++) {
                for(int j=1;j<=i;j++){
                System.out.print( j+" " );
                if(i==j){
                System.out.println("");
            
        }}}}}
