/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ibai
 */
public class T4Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //areaCirculo();
        //mayorEdad();
        //menorDeTres();
        //calculadoraFuncional();
        //diasSemana();
        mostrarPares();
    }
    public static void areaCirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio");
        double radio = sc.nextDouble();
        double area = radio*radio*Math.PI;
        System.out.println("Area: "+area);
    }
    public static void mayorEdad(){
        Scanner sc = new Scanner(System.in);
        int edad=0;
        boolean valido=false;
        do {
            try {
                System.out.println("\nIntroduce tu edad:");
                edad=sc.nextInt();
                if (edad>=18) {
                    System.out.println("Mayor de edad.");
                    valido=true;
                }else if(edad<18 && edad>=0){
                    System.out.println("Menor de edad.");
                    valido=true;
                }else{
                    System.out.println("Que pongas una edad real. Parguela.");
                }
                } catch (InputMismatchException e) {
                    System.out.println("A ver, pon un numero.");
                    sc.nextLine();
                }
        } while (!valido);
    }
    public static void menorDeTres(){
        Scanner sc = new Scanner(System.in);
        int num1=0, num2=0, num3=0;
        boolean valido1=false, valido2=false, valido3=false;//creamos las variables
        do {
            try {
                System.out.println("\nIntroduce tres numeros positivos:");
                System.out.println("Primer numero:");
                num1=sc.nextInt();//pedimos el primer numero
                if (num1>=0) {//si es valido bien
                    valido1=true;
                }else{
                    System.out.println("Numero invalido.");
                }
                System.out.println("Segundo numero:");
                num2=sc.nextInt();//con el segundo igual
                if (num2>=0) {
                    valido2=true;
                }else{
                    System.out.println("Numero invalido.");
                }
                System.out.println("Tercer numero:");
                num3=sc.nextInt();//y el tercero
                if (num3>=0) {
                    valido3=true;
                }else{
                    System.out.println("Numero invalido.");
                }
                } catch (InputMismatchException e) {
                    System.out.println("NU-ME-ROS.");
                    sc.nextLine();
                }
        } while (!valido1 && !valido2 && !valido3);
        if (num1<num2 && num1<num3) {
            System.out.println("El menor es: "+num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("El menor es: "+num2);
        }else{
            System.out.println("El menor es: "+num3);
        }
    }
    public static void calculadoraFuncional(){
        int num1=-1, num2=-1;
        Scanner sc=new Scanner(System.in);
        boolean valido=false;
        do {
            System.out.println("---CALCULADORA---");
            System.out.println("Introduce 2 numeros:");
            try {
                System.out.println("Primer numero:");
                num1=sc.nextInt();
                System.out.println("Segundo numero:");
                num2=sc.nextInt();
                valido=true;
            } catch (InputMismatchException e) {
                System.out.println("Numeros enteros.");
                sc.nextLine();
            }
            
        } while (!valido);
        int opcion=0, resultado;
        do {
            System.out.println("\nElija la operacion:");
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir.");
            try {
                System.out.println("Introduzca su opcion:");
                opcion=sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error! Opcion no valida.");
                sc.nextLine();
            }
            switch (opcion) {
                case 1:
                    resultado=num1+num2;
                    System.out.println("Resultado: "+resultado);
                    break;
                case 2:
                    resultado=num1-num2;
                    System.out.println("Resultado: "+resultado);
                    break;
                case 3:
                    resultado=num1*num2;
                    System.out.println("Resultado: "+resultado);
                    break;
                case 4:
                    try {
                        resultado=num1/num2;
                        System.out.println("Resultado: "+resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("No es podible dividir por 0.");
                    }
                    break;
                default:
                    System.out.println("");
            }
        } while (opcion!=5);
    }
    public static void diasSemana(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean valido = false;
        do {
            try {//despues controlamos con try catch que no meta una letra, por ejemplo
                System.out.println("Introduzca la opcion:");
                opcion = sc.nextInt();
                valido= true;
            } catch (InputMismatchException e) {
                System.out.println("Error!");
                sc.nextLine();//limpiamos buffer y tiramos error
            }
        } while (!valido);
        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido.");
        }
    }
    public static void mostrarPares(){
        for (int i = 10; i <= 30; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    
}
