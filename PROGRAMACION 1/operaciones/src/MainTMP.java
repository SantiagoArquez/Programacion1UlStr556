import datos.Computador;

public class MainTMP {
    public static void main(String[] args) {
        System.out.println("Listo ");

        //instancia
        Computador unnombre = new Computador();

        unnombre.valor = 0;

        unnombre.correr();

        System.out.println(unnombre.valor);


    }
}
