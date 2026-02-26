package interaccion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Consola {
    private Scanner sc=new Scanner(System.in);
    public void imprimir(String loquequieras){
        System.out.println("Aca lo que "+loquequieras);
    }
    public String leernumero(String mensaje){
        System.out.print("Digite numero : ");
        Long numero=sc.nextLong();
        return numero;
    }
    public String leercadena(String mensaje){
        System.out.print("Digite cadena : ");
        String cadena=sc.nextLine();
        return cadena;
    }
    public String leerfecha(String mensaje){
        System.out.print("Digite fecha : ");
        String dato=sc.nextLine();
        return dato;
    }
    public Date convertirStringDate(String fechaS){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(fechaS);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto.");
        }
        return null;
    }
}



