import usoo.Consola;
import utili.Operacion;

public class Main {

    public static void main (String[] lamejorcalculadora) {
        Consola consola = new Consola();
        Operacion operaciones = new Operacion();
        double reinicio=1;
        while (reinicio==1){
        double opcion;
        System.out.println("Selecciones una opcion 1 para sumar 2 para restar 3 para multiplicar o 4 para dividir");
        opcion=consola.leer();
            if(opcion==1){
                System.out.println("Inicio de suma");
                System.out.println("Desea sumar 2 o 3 numeros");
                double sumaop;
                sumaop=consola.leer();
                if(sumaop==2){
                    System.out.println("Suma de dos numeros");
                    double num1 = consola.leer();
                    double num2 = consola.leer();
                    double resultado=operaciones.sumardos(num1, num2);
                    consola.imprimir(resultado);
                }
                else if (sumaop==3){
                    System.out.println("Suma de tres numeros");
                    double num1=consola.leer();
                    double num2=consola.leer();
                    double num3=consola.leer();
                    double resultado=operaciones.sumartres(num1, num2,num3);
                    consola.imprimir(resultado);
                }
            }else if(opcion==2){
                System.out.println("Inicio de la resta ingresa dos numeros ");
                double num1 = consola.leer();
                double num2 = consola.leer();

                double resultado=operaciones.restar(num1, num2);
                consola.imprimir(resultado);
            }else if(opcion==3){
                System.out.println("Inicio de la multiplicacion");
                System.out.println("Desea multiplicar 2 o 3 numeros");
                double multiop;
                multiop=consola.leer();
                if(multiop==2){
                    System.out.println("Multiplicacion de dos numeros");
                    double num1 = consola.leer();
                    double num2 = consola.leer();
                    double resultado=operaciones.multiplicardos(num1, num2);
                    consola.imprimir(resultado);
                }
                else if (multiop==3){
                    System.out.println("Multiplicacion de tres numeros");
                    double num1 = consola.leer();
                    double num2 = consola.leer();
                    double num3 = consola.leer();
                    double resultado=operaciones.multiplicartres(num1, num2,num3);
                    consola.imprimir(resultado);
                }
            }else if (opcion==4){
                System.out.println("Inicio de la division");
                double num1 = consola.leer();
                double num2 = consola.leer();
                if (num1 == -1 ||num1 == 0 || num2 == -1 || num2 == 0){
                    System.out.println("Dato invalido o division por cero. Fin programa.");
                    return;
                }
                double resultado = operaciones.dividir(num1, num2);
                consola.imprimir(resultado);
            }else{
                System.out.println("Opcion invalida");
                return;
            }
        System.out.println("Quieres hacer otra ecuacion? 1 para si 2 para no");
        reinicio=consola.leer();

        System.out.println("Gracias por usar este programa");
            }   
        }
    }
