import usoo.Consola;
import utili.Operacion;

public class main {

    public static void main (String[] args) {
        System.out.println("Inicio SUMA");
        Consola consola=new Consola();
        
        Operacion operaciones=new Operacion();
        double num1=consola.leer();
        double num2=consola.leer();
        double num3=consola.leer();
        double resultado=operaciones.sumar(num1, num2,num3);
        consola.imprimir(resultado);

        System.out.println("Inicio MULTIPLICACION");
        num1 = consola.leer();
        num2 = consola.leer();
        num3 = consola.leer();

        resultado=operaciones.multiplicar(num1, num2,num3);
        consola.imprimir(resultado);

        System.out.println("Inicio DIVISION");
        num1 = consola.leer();
        num2 = consola.leer();
        if (num1 == -1 || num2 == -1 || num2 == 0){
            System.out.println("Dato invalido o division por cero. Fin programa.");
            return;
        }
        resultado = operaciones.dividir(num1, num2);
        consola.imprimir(resultado);

        System.out.println("Inicio RAIZ");
        double numRaiz = consola.leer();
        if (numRaiz == -1){
            System.out.println("Dato invalido. Fin programa.");
            return;
        }

        double resultadoRaiz = operaciones.raiz(numRaiz);
        consola.imprimir(resultadoRaiz);

        System.out.println("Fin");
    }
}
