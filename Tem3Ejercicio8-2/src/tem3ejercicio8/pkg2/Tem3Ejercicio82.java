/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tem3ejercicio8.pkg2;

import java.util.Scanner;

/**
 *
 * @author Ibai
 */
public class Tem3Ejercicio82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dinero, bi50=50, bi20=20, bi10=10, bi5=5, mo2=2, mo1=1;
        Scanner entrada = new Scanner(System.in);//creamos las variables y el escaner

        System.out.print("Por favor, indique una cantidad de dinero: ");
        dinero=entrada.nextInt();//guardamos el dinero total

        System.out.println(dinero + " Euros se descomponen en:");
        bi50=dinero/50;//hacemos el calculo de billetes de 50
        if (bi50>0) {
            System.out.println("Billetes de 50: "+bi50);
        }//y si hay lo mostramos
        bi20=(dinero%50)/20;
        if (bi20>0) {//lo mismo con los de 20
            System.out.println("Billetes de 20: "+bi20);
        }
        bi10=((dinero%50)%20)/10;
        if (bi10>0) {//igual con los de 10
            System.out.println("Billetes de 10: "+bi10);
        }
        bi5=(((dinero%50)%20)%10)/5;
        if (bi5>0) {//con los de 5
            System.out.println("Billetes de 5: "+bi5);
        }
        mo2=((((dinero%50)%20)%10)%5)/2;
        if (mo2>0) {//con las monedas de 2
            System.out.println("Monedas de 2: "+mo2);
        }
        mo1=((((dinero%50)%20)%10)%5)%2;
        if (mo1>0) {//y las monedas de 1
            System.out.println("Monedas de 1: "+mo1);
        }
        
    }
}
