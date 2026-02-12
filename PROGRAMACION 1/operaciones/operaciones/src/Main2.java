import java.util.Scanner;

public class Main2 {
public static void main(String[] comoquiera) {
    IO.println("Inicio SUMA");
  // sumar
  long num1 = leer();
  if (num1 == -1){
    System.out.println("No es un numero,  Finaliza programa ");
    return ;
  }

  long num2 = leer();
  if (num2 == -1){
    System.out.println("No es un numero, Finaliza programa ");
    return ;
  }
  long resultado = sumar(num2, num1);
  imprimir(resultado);

  // multiplicar
  IO.println("Inicio MULTIPLICACION");
  num1 = leer();
  if (num1 == -1){
    System.out.println("No es un numero, Finaliza programa ");
    return ;
  }
  num2 = leer();
  if (num2 == -1){
    System.out.println("No es un numero, Finaliza programa ");
    return ;
  }
  resultado = multiplicar(num2, num1);
  imprimir(resultado);
// dividir
  IO.println("Inicio DIVIDIR");
  num1 = leer();
  if (num1 == -1){
    System.out.println("No es un numero, Finaliza programa ");
    return ;
  }
  num2 = leer();
  if (num2 == -1){
    System.out.println("No es un numero, Finaliza programa ");
    return ;
  }
  resultado = dividir(num2, num1);
  imprimir(resultado);

  System.out.println("Fin");


    
    }
public static long leer(){
  Scanner sc = new Scanner(System.in);
  System.out.print("Digite un numero : ");
  String dato = sc.nextLine();
  if (dato.isEmpty())
    return -1;
  else
    return Long.parseLong(dato);
}
public static void imprimir(long numero){
  IO.println("Resultado es "+numero);
}
public static long sumar(long a, long b){
  return a+b;
}
public static long multiplicar(long a, long b){

  return a*b;
}    
public static long dividir(long a, long b){

  return a/b;
}
//Fin de clase

}