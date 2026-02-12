package misarchivos;
import java.util.Scanner;
public class tareagpt {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args){
    ejecutarPrograma();

    leer.close();
}
    public static void ejecutarPrograma(){
        long reinicio==1;
        while (reinicio==1){

        }

    }
    public static long preguntarReinicio(){
        System.out.println("Si desea hacer otra suma o multiplicación ingrese 1, de lo contrario ingrese 0:");
        return leer.nextLong();
    }
}