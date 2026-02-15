package utili;

public class Operacion {
    public double sumar(double a,double b,double c){
        return a+b+c;
    }

    public double multiplicar(double a,double b,double c){
        return a*b*c;
    }

    public double dividir(double a, double b){
        if (b == 0){
            System.out.println("Error: division por cero");
            return 0;
        }
        return a / b;
    }

    public double raiz(double a){
        if (a < 0){
            System.out.println("Error: no existe raiz real de numero negativo");
            return 0;
        }
        return Math.sqrt(a);
    }
}
