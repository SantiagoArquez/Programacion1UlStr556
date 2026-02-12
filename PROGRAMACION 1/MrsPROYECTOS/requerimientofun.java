package MrsPROYECTOS;
import java.util.Scanner;
public class requerimientofun{
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args){
        ejecutarPrograma();
        leer.close();
    }
    // Control general del programa
    public static void ejecutarPrograma(){
        long reinicio=1;
        while (reinicio==1){
            long opcion=mostrarMenu();
            switch ((int)opcion){
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarMultiplicacion();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            reinicio=preguntarReinicio();
        }
    }
    // Menú principal
    public static long mostrarMenu(){
        System.out.println("Ingrese 1 para sumar o 2 para multiplicar:");
        return leer.nextLong();
    }
    // Método para sumar
    public static void realizarSuma(){
        long x=leerNumero("Ingrese el primer número que desee sumar:");
        long y=leerNumero("Ingrese el segundo número a sumar:");
        long suma=x+y;
        System.out.println("La suma de los valores es: "+suma);
    }
    // Método para multiplicar
    public static void realizarMultiplicacion(){
        long a=leerNumero("Ingrese el primer número que desee multiplicar:");
        long b=leerNumero("Ingrese el segundo número a multiplicar:");
        long multiplicacion=a*b;
        System.out.println("La multiplicación de sus números es: "+multiplicacion);
    }
    // Lectura genérica de números
    public static long leerNumero(String mensaje){
        System.out.println(mensaje);
        return leer.nextLong();
    }
    // Pregunta si desea reiniciar
    public static long preguntarReinicio(){
        System.out.println("Si desea hacer otra suma o multiplicación ingrese 1, de lo contrario ingrese 0:");
        return leer.nextLong();
    }
}