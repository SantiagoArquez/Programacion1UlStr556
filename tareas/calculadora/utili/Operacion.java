package utili;

public class Operacion {
    public double sumartres(double a,double b,double c){
        return a+b+c;
    }
    public double sumardos(double a,double b){
        return a+b;
    }
    public double multiplicardos(double a,double b){
        return a*b;
    }
    public double multiplicartres(double a,double b,double c){
        return a*b*c;
    }

    public double dividir(double a, double b){
        if (b == 0){
            System.out.println("Error: division por cero");
            return 0;
        }
        return a / b;
    }

    public double restar(double a, double b){
        
        return a - b;
    }
}
