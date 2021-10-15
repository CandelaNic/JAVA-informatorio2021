import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Como es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);

        entrada.close();
    }

}