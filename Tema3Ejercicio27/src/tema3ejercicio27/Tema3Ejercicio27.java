/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio27;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ibai
 */
public class Tema3Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2=0, resultado, opcion=0;//creamos las variables y el escaner
        Scanner sc = new Scanner(System.in);
        
        try {//en el try pedimos los numeros al ususario
            System.out.println("Introduce el primer numero:");
            num1=sc.nextInt();
            System.out.println("Introduce el segundo numero:");
            num2=sc.nextInt();
        } catch (InputMismatchException e) {//pillamos la excepción y mostramos error
            System.out.println("Valor introducido erroneo. Vuelva a intentarlo.");
        }
        
        do {//hacemos el menú con un do-while
            System.out.println("\n1.-Sumar los numeros.");
            System.out.println("2.-Restar los numeros.");
            System.out.println("3.-Multiplicar los numeros.");
            System.out.println("4.-Dividir los numeros.");
            System.out.println("5.-Salir del programa.");
            System.out.println("Elige una opcion:");
            opcion=sc.nextInt();//aquí pedimos el número pal menú
            
            switch (opcion) {//y seguimos con un switch
                case 1:
                    resultado=num1+num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 2:
                    resultado=num1-num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 3:
                    resultado=num1*num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 4:
                    try {//con este try catch controlamos el caso de división por 0
                        resultado=num1/num2;
                        System.out.println("El resultado es: "+resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir por 0.");
                    }
                    break;
                case 5:
                    break;
                default://después ya terminamos el switch
                    throw new AssertionError();//y listo
            }
        } while (opcion!=5);
    }
}
