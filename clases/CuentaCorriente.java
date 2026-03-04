import java.util.Scanner;

public class CuentaCorriente extends Cuenta{
    public double cuotaExtra;
    public double cuotaManejo;
    Scanner sc=new Scanner(System.in);

    // CONSTRUCTOR DE CUENTACORRIENTE
    // También llama primero al constructor del padre

    public CuentaCorriente(){
        System.out.println("Ingrese cuota extra: ");
        cuotaExtra=sc.nextDouble();
        System.out.println("Ingrese cuota de manejo: ");
        cuotaManejo=sc.nextDouble();
    }
    
    // Constructor sobrecargado
    public CuentaCorriente(String numeroCuenta, double saldo, double cuotaExtra, double cuotaManejo){
        //constructor de la clase padre trabajando
        //super=clasepadre
        super(numeroCuenta, saldo);
        //this es para no embolatar el mismo atributo
        this.cuotaExtra = cuotaExtra;
        this.cuotaManejo = cuotaManejo;
    }

    public void mostrarDatosC() {
        System.out.println("====== Cuenta Corriente ======");
        System.out.println("Número de Cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Cuota extra: "+cuotaExtra);
        System.out.println("Cuota de Manejo: "+cuotaManejo);
    }
}