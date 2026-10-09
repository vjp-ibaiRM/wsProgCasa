/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Ibai
 */
public class Tema3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, num4, aux=0;//creamos variables y escaner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        num1=entrada.nextInt();//vamos pidiendo y guardando los numeros
        System.out.println("Introduce el segundo numero: ");
        num2=entrada.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3=entrada.nextInt();
        System.out.println("Introduce el cuarto numero: ");
        num4=entrada.nextInt();
        
        if (num1>num2) {//comparamos los numeros en la primera vuelta
            aux=num1;//y los vamos intercambiando con el metodo de la burbuja
            num1=num2;
            num2=aux;
        }
        if (num2>num3) {
            aux=num2;
            num2=num3;
            num3=aux;
        }
        if (num3>num4) {
            aux=num3;
            num3=num4;
            num4=aux;
        }//---------------------------------------------------------------
        if (num1>num2) {//los volvemos a comparar en la segunda vuelta
            aux=num1;//y los seguimos intercambiando pa que se ordenen
            num1=num2;
            num2=aux;
        }
        if (num2>num3) {
            aux=num2;
            num2=num3;
            num3=aux;
        }//------------------------------------------------------------------
        if (num1>num2) {//y con la tercera vuelta deberían estar ordenados
            aux=num1;//ya tienen que estar cada uno en su sitio
            num1=num2;
            num2=aux;
        }//después los mostramos
        System.out.println("El orden de los numeros introducidos es: "+num1+" - "+num2+" - "+num3+" - "+num4);
    }
}
