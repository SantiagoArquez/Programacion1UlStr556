package MrsPROYECTOS;
//leer dos numeros de hasta 8 cifras realizar la suma e imprimir su resultado
import java.util.Scanner;
public class requerimiento1
{
    public static void main(String args[])
    {  
        long reinicio=1;
        try (Scanner leer=new Scanner (System.in)){
            while (reinicio==1){
                long opcion=1;
                System.out.println("Ingrese 1 para sumar o 2 para multiplicar: ");
                opcion=leer.nextLong();
                    if (opcion==1){
                        long x=1;
                        long y=1;
                        long suma=0;
                        System.out.println("Ingrese el primer numero que desee sumar: ");
                        x=leer.nextLong();
                        System.out.println("Ingrese el segundo numero a sumar: ");
                        y=leer.nextLong();
                        suma=suma+x+y;
                        System.out.println("La suma de los valores es: "+ suma);
                        }
                    else if(opcion==2){
                        long a=1;
                        long b=1;
                        long multiplicacion=0;
                        System.out.println("Ingrese el primer numero que desee multiplicar: ");
                        a=leer.nextLong();
                        System.out.println("Ingrese el segundo numero a multiplicar: ");
                        b=leer.nextLong();
                        multiplicacion=a*b;
                        System.out.println("La multiplicacion de sus numeros es: "+multiplicacion);

                    }    
                    System.out.println("Si desea hacer otra suma o multiplicacion ingrese 1 caso tal sea no ingrese 0: ");
                    reinicio=leer.nextLong();
                    }
        }     
}
}