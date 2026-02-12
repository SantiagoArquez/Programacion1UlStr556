package interaccion;

import java.util.Scanner;

public class Consola {
    public long leer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero : ");
        String dato = sc.nextLine();
        if (dato.isEmpty())
            return -1;
        else
            return Long.parseLong(dato);

    }
    public void  imprimir(long numero){
        System.out.println("Resultado es "+numero);
    }
}
