/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NaveEspacial {
    
    public static void main(String[] args) {
        crearMenu();//en el main solo vamos a llamar al metodo que crea el menú
    }
    
    public static void mostrarMenu(){//aquí metemos todos los sout del menú
        System.out.println("\n==============================");
        System.out.println("        HALCON MILENARIO      ");
        System.out.println("==============================");
        System.out.println("");
        System.out.println("1. Sistema de navegacion.");
        System.out.println("2. Gestion de combustible.");
        System.out.println("3. Diagnostico de sistemas.");
        System.out.println("4. Generador de codigos.");
        System.out.println("5. Apagar motor.");
    }
    
    public static double pedirOpcion(){
        double opcion=0;//en este método pediremos la opción
        Scanner entrada=new Scanner(System.in);
        try {//y controlamos aquí que no meta otros carácteres
            opcion=entrada.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error! Opcion no valida.");
            entrada.nextLine();
        }
        return opcion;//y lo devolvemos
    }
    
    public static void crearMenu(){
        int opcion;//donde vamos a crear el menú
        do {
            mostrarMenu();//lo mostramos
            System.out.println("Introduzca la opcion que desea realizar:");
            opcion=(int)pedirOpcion();
            switch (opcion) {//pedimos y guardamos con nuestro método de pedir
                case 1://y vamos llamando a cada método
                    sistemaDeNavegacion();
                    break;
                case 2:
                    gestionarCombustible();
                    break;
                case 3:
                    diagnosticarSistemas();
                    break;
                case 4:
                    generarCodigos();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error! Opcion no valida.");
            }//la opción 5 es la de salida
        } while (opcion!=5);
    }
    
    public static void sistemaDeNavegacion(){
        double x=0, y=0;//en el primero hay que hacer un teorema de Pitágoras
        System.out.println("\nNecesitmos triangular nuestra posicion.");
        System.out.println("Introduce nuestra posicion, primero la coordenada X:");
        x=pedirOpcion();//pedimos y vamos guardando
        System.out.println("Ahora la coordenada Y:");
        y=pedirOpcion();//usando el mismo metodo pa guardar y pedir
        double posicion=calcularDistancia(x, y);//y llamamos a otro método que hace los cáculos
        System.out.println("Perfecto, nuestra posicion es: "+posicion);
    }// y mostramos lo que hemos calculado
    public static double calcularDistancia(double x, double y){
        double distancia= Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        return distancia;//aquí le pasamos los datos, usamos el Math pa calcular
    }//y devolvemos el resultado
    
    public static void gestionarCombustible(){
        int combustible=1000, consumo=0;
        while (combustible>0) {//aquí vamos a jugar con el combustible
            System.out.println("Combustible actual: "+combustible);
            System.out.println("Consumo del trayecto:");
            try {//decimos cuanto queda y cuanto quiere quitar
                consumo=(int)pedirOpcion();
            } catch (Exception e) {//controlamos excepción
                System.out.println("Error!");
            }//y vamos evaluando y ejecutando
            if (consumo>0 && consumo<=combustible) {
                combustible-=consumo;//y mostramos lo que queda
                System.out.println("Combustible restante: "+combustible);
            }else{//si mete algo que no nos gusta tiramos error
                System.out.println("Error! Consumo no valido.");
            }
        }
        if (combustible==0) {//y cuando no queda pues ya sale de este método
            System.out.println("CODIGO ROJO! Combustible al minimo.");
        }
    }
    
    public static void diagnosticarSistemas(){
        for (int i = 0; i < 5; i++) {//para el diagnóstico de sistemas
            if (i==3) {//solo pasamos por los sistemas
                continue;//saltamos el 3
            }
            if (i==5) {//y tiramos un fallo en el 5
                System.out.println("Fallo critico detectado.");
            }//y vamos imprimiendo
            System.out.println("Sistema "+i+" correcto.");
        }
    }
    
    public static void generarCodigos(){//por último un código random
        System.out.println("Codigo identificativo de la mision:");
        int codigo=(int)Math.round(Math.random()*999)+1;//del 1 al 1000
        //usamos Math.random para sacarlo y Math.round para redondearlo
        //aparte de un casting para guardarlo en int
        System.out.println("-> "+codigo);//y mostramos
    }
}