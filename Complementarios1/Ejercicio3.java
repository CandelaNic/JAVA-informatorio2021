import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        entrada.close();
        for (int i=1; i<=numero; i++){
            List<Integer> lista = new ArrayList<Integer>();
            for (int a=1; a<=i; a++){
                lista.add(a);
            }
            System.out.println(lista);
        }
    }    
}
