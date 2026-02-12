import interaccion.Consola;
import util.OperacionesMath;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Inicio SUMA");

        Consola laconsola = new  Consola();
        // sumar
        long num1 = laconsola.leer();
        if (num1 == -1){
            System.out.println("No es un numero,  Finaliza programa ");
            return ;
        }

        long num2 = laconsola.leer();
        if (num2 == -1){
            System.out.println("No es un numero, Finaliza programa ");
            return ;
        }
        OperacionesMath operaciones = new OperacionesMath();

        long resultado = operaciones.sumar(num2, num1);
        laconsola.imprimir(resultado);

        // multiplicar
        System.out.println("Inicio MULTIPLICACION");
        num1 = laconsola.leer();
        if (num1 == -1){
            System.out.println("No es un numero, Finaliza programa ");
            return ;
        }
        num2 = laconsola.leer();
        if (num2 == -1){
            System.out.println("No es un numero, Finaliza programa ");
            return ;
        }
        resultado = operaciones.multiplicar(num2, num1);
        laconsola.imprimir(resultado);
// dividir
        System.out.println("Inicio DIVIDIR");
        num1 = laconsola.leer();
        if (num1 == -1){
            System.out.println("No es un numero, Finaliza programa ");
            return ;
        }
        num2 = laconsola.leer();
        if (num2 == -1){
            System.out.println("No es un numero, Finaliza programa ");
            return ;
        }
        resultado = operaciones.dividir(num2, num1);
        laconsola.imprimir(resultado);

        System.out.println("Fin");


    }



}
