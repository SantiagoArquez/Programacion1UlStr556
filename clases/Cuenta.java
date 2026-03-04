import java.util.Scanner;
public class Cuenta{

    public String numeroCuenta;
    public double saldo;
    Scanner sc=new Scanner(System.in);

    // CONSTRUCTOR DE LA CLASE CUENTA
    // Tiene el mismo nombre que la clase
    // No tiene tipo de retorno
    // Se ejecuta cuando : new Cuenta()

    public Cuenta(){
        System.out.println("------------------------------------");
        System.out.println("Ingrese número de cuenta: ");
        numeroCuenta = sc.nextLine();
        System.out.println("Ingrese saldo: ");
        saldo = sc.nextDouble();
    }

    // NUEVO constructor sobrecargado

    public Cuenta(String numeroCuenta, double saldo){

        this.numeroCuenta = numeroCuenta;
        
        this.saldo = saldo;
    }

    public void mostrarDatos(){
        System.out.println("Número de Cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
    }
}