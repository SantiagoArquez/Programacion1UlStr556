import usoo.Consola;
import utili.Operacion;

public class main {

    public static void main (String[] lamejorcalculadora) {
        Consola consola = new Consola();
        Operacion operaciones = new Operacion();
        double reinicio=1;
        while (reinicio==1){
            double opcion=1;
            System.out.println("Selecciones una opcion 1 para sumar 2 para restar 3 para multiplicar y 4 para dividir");
            opcion=consola.leer();
            if(opcion==1){
                System.out.println("Inicio de suma ingresa de dos a 3 numeros");
                double num1=consola.leer();
                double num2=consola.leer();
                double num3=consola.leer();
                double resultado=operaciones.sumar(num1, num2,num3);
                consola.imprimir(resultado);
            }
            else if(opcion==2){
                System.out.println("Inicio de la resta ingresa dos numeros ");
                double num1 = consola.leer();
                double num2 = consola.leer();

                double resultado=operaciones.restar(num1, num2);
                consola.imprimir(resultado);
            }
            else if(opcion==3){
                System.out.println("Inicio de la multiplicacion ingresa de dos a 3 numeros");
                double num1 = consola.leer();
                double num2 = consola.leer();
                double num3 = consola.leer();

                double resultado=operaciones.multiplicar(num1, num2,num3);
                consola.imprimir(resultado);
            }
            else if (opcion==4){

                System.out.println("Inicio DIVISION");
                double num1 = consola.leer();
                double num2 = consola.leer();
                if (num1 == -1 ||num1 == 0 || num2 == -1 || num2 == 0){
                    System.out.println("Dato invalido o division por cero. Fin programa.");
                    return;
                }
                double resultado = operaciones.dividir(num1, num2);
                consola.imprimir(resultado);
            }
        System.out.println("Quieres hacer otra ecuacion? 1 para si 2 para no");
        reinicio=consola.leer();

        System.out.println("Gracias por usar este programa");
        }   
}
}