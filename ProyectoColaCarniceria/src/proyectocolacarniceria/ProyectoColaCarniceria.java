/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocolacarniceria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ibai
 */
public class ProyectoColaCarniceria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tickets compra: C + Math.random
        //tickets recogida: R + Math.random
        mostrarMenu();
    }
    public static void mostrarMenu() {
        //en este método vamos a hacer un menú para el usuario
        int opcion;
        do {//creamos el escaner y la opcion y le mostramos el menu
            System.out.println("\n---MENU---");
            System.out.println("1. Comprar.");
            System.out.println("2. Recoger.");
            System.out.println("3. Generar lote de tickets.");
            System.out.println("4. Salir.");
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:
                    comprarTicket();
                    break;
                case 2:
                    recogerTicket();
                    break;
                case 3:
                    generarLote();
                    break;
                case 4:
                    System.out.println("Finalizando programa. Adios.");
                    break;
                default://si mete otro numero no nos vale
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
    }

    public static int pedirOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        try {//despues controlamos con try catch que no meta una letra, por ejemplo
            System.out.println("Introduzca la opcion:");
            opcion = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error!");
            sc.nextLine();//limpiamos buffer y tiramos error
        }
        return opcion;
    }

    public static void comprarTicket() {
        //creamos el numero aleatorio para los tickets de compra
        double aleatorio = (Math.random() * (100 - 1 + 1) + 1);
        //y con un casting lo dejamos en int
        int num = (int) aleatorio;
        System.out.println("C-" + num);
    }

    public static void recogerTicket() {
        //creamos el numero aleatorio para los tickets de recogida
        double aleatorio = (Math.random() * (100 - 1 + 1) + 1);
        //y con un casting lo dejamos en int
        int num = (int) aleatorio;
        System.out.println("R-" + num);
    }

    public static void generarLote() {
        String tipo = "";//creamos las variables y el escaner
        int cantidad;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduzca el tipo");
            tipo = sc.nextLine();//pedirmos y guardamos el tipo
        } catch (InputMismatchException e) {
            System.out.println("Error! Pruebe de nuevo.");
            sc.next();
        }
        if (tipo.equalsIgnoreCase("comprar") || tipo.equalsIgnoreCase("recoger")) {
            //si lo pone bien seguimos y pedimos la cantidad
            System.out.println("Cantidad de tickets:");
            cantidad = sc.nextInt();
            if (cantidad % 2 == 0) {//si pone una cantidad par
                ticketsLote(tipo, cantidad);
            } else {//si no es par le tiramos error
                System.out.println("Error!");
                sc.nextLine();//limpiamos buffer y tiramos error
            }
        } else {//si no le tiramos error
            System.out.println("Error!");
            sc.nextLine();
        }
    }

    public static void ticketsLote(String tipo, int cantidad) {
        if (tipo.equalsIgnoreCase("comprar")) {
            for (int i = 0; i < cantidad; i++) {
                comprarTicket();
            }
        } else if (tipo.equalsIgnoreCase("recoger")) {
            for (int i = 0; i < cantidad; i++) {
                recogerTicket();
            }
        }
    }
}
