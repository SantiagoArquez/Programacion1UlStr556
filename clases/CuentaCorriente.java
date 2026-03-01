import java.util.Scanner;

public class CuentaCorriente extends Cuenta{
    public double cuotaExtra;
    public double cuotaManejo;
    Scanner sc=new Scanner(System.in);
    public CuentaCorriente(){
        System.out.println("Ingrese cuota extra: ");
        cuotaExtra=sc.nextDouble();
        System.out.println("Ingrese cuota de manejo: ");
        cuotaManejo=sc.nextDouble();
    }

    public void mostrarDatosC() {
        System.out.println("====== Cuenta Corriente ======");
        System.out.println("Número de Cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Cuota extra: "+cuotaExtra);
        System.out.println("Cuota de Manejo: "+cuotaManejo);
    }
}