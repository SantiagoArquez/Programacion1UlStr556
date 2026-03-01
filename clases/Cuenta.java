import java.util.Scanner;
public class Cuenta{
    public String numeroCuenta;
    public double saldo;
    Scanner sc=new Scanner(System.in);

    public Cuenta(){
        System.out.println("------------------------------------");
        System.out.println("Ingrese número de cuenta: ");
        numeroCuenta = sc.nextLine();
        System.out.println("Ingrese saldo: ");
        saldo = sc.nextDouble();
    }
    public void mostrarDatos(){
        System.out.println("Número de Cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
    }
}