import java.util.Scanner;

public class CuentaAhorros extends Cuenta{
    public double tasaInteres;
    public double limiteRetiro;
    Scanner sc = new Scanner(System.in);

    // CONSTRUCTOR DE CUENTAAHORROS
    // Llama automáticamente al constructor de Cuenta (padre)
    // Se ejecuta cuando : new CuentaAhorros()
    
    public CuentaAhorros(){

        System.out.println("Ingrese tasa de interés: ");
        tasaInteres=sc.nextDouble();
        System.out.println("Ingrese límite de retiro: ");
        limiteRetiro=sc.nextDouble();
    }
    //Constructor sobrecargado 

    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteres, double limiteRetiro){

        super(numeroCuenta, saldo); // usa el constructor sobrecargado del padre
        this.tasaInteres = tasaInteres;
        this.limiteRetiro = limiteRetiro;
    }
    public void mostrarDatosA(){
        System.out.println("====== Cuenta Ahorros ======");
        System.out.println("Número de Cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Tasa de Interés: "+tasaInteres);
        System.out.println("Límite de Retiro: "+limiteRetiro);
    }
}