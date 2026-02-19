package interaccion;
import java.util.Scanner;

public class Consola {
    private Scanner sc=new Scanner(System.in);
    public void imprimir(String loquequieras){
        System.out.println("Aca lo que "+loquequieras);
    }
    public double leer(){
        System.out.print("Digite loquequieras : ");
        String dato=sc.nextLine();
        
        return Double.parseDouble(dato);
    }
}



