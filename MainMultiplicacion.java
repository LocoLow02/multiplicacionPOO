import java.util.Scanner;
// Entrada de librreria
public class MainMultiplicacion {
    // Nombre de la clase
    public static void main(String[]args){
        // Metodo main
        Scanner opc = new Scanner(System.in);
        // Estructura del metodo constructor
        System.out.println("Ingresa un numero");
        // Impresion de mensaje
        int a= opc.nextInt();
        // Lectura del tipo de variable
        System.out.println("Ingresa otro numero");
        // Impresion de mensaje
        int b= opc.nextInt();
        // Lectura del tipo de dato
        int r= a*b;
        // Operacion de las variables, leyendo su tipo de dato
        Multiplicacion mul= new Multiplicacion();
        mul.a=a;
        mul.b=b;
        mul.r=r;
        System.out.println("El resultado de la multiplicacion:"+mul. mostrarResultado());
     // Impresion del mensaje concatenado al comportamiento
    }
}    
// Llaves que cierran