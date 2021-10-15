import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese un numero entero");
        int numero2 = entrada.nextInt();

        System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + (numero1*numero1));
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2));
        System.out.println(numero1 + " % " + numero2 + " = " + (numero1%numero2));
        
        entrada.close();

    }
}    