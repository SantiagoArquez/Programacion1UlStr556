package usoo;
import java.util.Scanner;

public class Consola {
    private Scanner sc=new Scanner(System.in);
    public void imprimir(double numero){
        System.out.println("Resultado es "+numero);
    }
    public double leer(){
        System.out.print("Digite un numero : ");
        String dato=sc.nextLine();
        if (dato.isEmpty())
            return -1;
        else
            return Double.parseDouble(dato);
    }
}



