import java.util.Scanner;
public class CuentaAhorros extends Cuenta{
    public double tasaInteres;
    public double limiteRetiro;
    Scanner sc = new Scanner(System.in);
    public CuentaAhorros(){

        System.out.println("Ingrese tasa de interés: ");
        tasaInteres=sc.nextDouble();
        System.out.println("Ingrese límite de retiro: ");
        limiteRetiro=sc.nextDouble();
    }
    public void mostrarDatosA(){
        System.out.println("====== Cuenta Ahorros ======");
        System.out.println("Número de Cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Tasa de Interés: "+tasaInteres);
        System.out.println("Límite de Retiro: "+limiteRetiro);
    }
}