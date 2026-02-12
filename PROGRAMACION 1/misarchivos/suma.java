package misarchivos;

import java.util.Scanner;
public class suma
{
    public static void main(String args[])
    {  
        int reinicio=1;
        Scanner leer=new Scanner (System.in);
        while (reinicio==1){
            int opcion=1;
            System.out.println("Selecione 1 si quieres sumar o 2 si quieres multiplicar");
            opcion=leer.nextInt();
                if (opcion==1){
                    int x=10;
                    int suma=0;
                    while (x!=0){
                        System.out.println("ingrese un numero que desee sumar, para finalizar ingrese 0");
                        x=leer.nextInt();
                        suma=suma+x;
                    }
                    System.out.println("la suma de los valores es :"+suma);
                    }
                else if (opcion==2){
                    int x=1;
                    int multiplicacion=1;
                    while (x!=0){
                        System.out.println("ingrese un numero que desee multiplicar, para finalizar ingrese 0");
                        x=leer.nextInt();
                        if(x!=0){
                            multiplicacion = multiplicacion*x;
                        }
                    }
                    System.out.println("la multiplicacion de los valores es :"+multiplicacion);
                    }
                System.out.println("Si desea hacer otra multiplicacion o suma ingrese 1 caso tal sea no ingrese 0");
                reinicio=leer.nextInt();
                leer.close();
                }     
    }
}