/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ibai
 */
public class Tema3Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2=0, resultado;//creamos las variables y el escaner
        Scanner sc = new Scanner(System.in);
        
        try {//en el try pedimos los numeros al ususario
            System.out.println("Introduce el primer numero:");
            num1=sc.nextInt();
            System.out.println("Introduce el segundo numero:");
            num2=sc.nextInt();
        } catch (InputMismatchException e) {//pillamos la excepción y mostramos error
            System.out.println("Valor introducido erroneo. Vuelva a intentarlo.");
        }
        //y seguimos con el código
        resultado=num1+num2;
        System.out.println("El resultado es: "+resultado);
    }
}
