/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Evaluacion {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void ejercicio_1() {
        //pedir tres valores y mostrarlos ordenados de mayor a menor 
        int x, y, z;
        System.out.println("Ingrese el primer valor: ");
        x = leer.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        y = leer.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        z = leer.nextInt();
        //condiciones 
        if (x > y && y > z) {
            System.out.println(x + "," + y + "," + z);
        } else {
            if (x > z && z > y) {
                System.out.println(x + "," + z + "," + y);
            } else {
                if (y > x && x > z) {
                    System.out.println(y + "," + x + "," + z);
                } else {
                    if (y > z && z > x) {
                        System.out.println(y + "," + z + "," + x);
                    } else {
                        if (z > x && y > x) {
                            System.out.println(z + "," + y + "," + x);
                        } else {
                            if (z > y && x > y) {
                                System.out.println(z + "," + x + "," + y);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ejercicio_2() {
        //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene. 
        int x;
        System.out.println("Ingrese el primer valor entre 0 a 9999");
        x = leer.nextInt();
        if (x < 0 || x > 9999) {
            System.out.println("El valor esta fuera del rango");
        } else {
            if (x < 10) {
                System.out.println("El valor tiene 1 cifra");
            } else {
                if (x < 100) {
                    System.out.println("El valor tiene 2 cifras");
                } else {
                    if (x < 1000) {
                        System.out.println("El valor tiene 3 cifras");
                    } else {
                        if (x < 10000) {
                            System.out.println("El valor tiene 4 cifras");
                        }
                    }
                }
            }
        }

    }

    public static void ejercicio_3() {
        //Pedir un número entre 0 y 9999 y mostrarlo con las cifras alreves 
        int x, invertir = 0, div;
        System.out.println("Ingreso un valor entre 0 y 9999");
        x = leer.nextInt();
        while (x > 0) {
            div = x % 10;
            invertir = invertir * 10 + div;
            x /= 10;
        }
        System.out.println("El numero invertido es: " + invertir);

    }

    public static void ejercicio_4() {
        //Pedir un número del 0 al 9999 y decir si es capicuá
        int num, aux, invertir = 0, cifras;
        System.out.println("Ingrese un valor entre 0 y 9999");
        num = leer.nextInt();
        aux = num;
        while (aux > 0) {
            cifras = aux % 10;
            invertir = invertir * 10 + cifras;
            aux = aux / 10;
        }
        if (num == invertir) {
            System.out.println("El numero " + num + " es capicua");
        } else {
            System.out.println("El numero " + num + " no es capicua");
        }
    }

    public static void ejercicio_5() {
        // Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, suficiente, bien
        int nota;
        System.out.println("Por favor ingrese una nota entre 0 a 10 ");
        nota = leer.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Esta nota no se encuentra en el rango permitido");
        } else {
            if (nota >= 0 && nota < 5) {
                System.out.println("La nota: " + nota + " es insuficiente");
            } else {
                if (nota >= 5 && nota <= 7) {
                    System.out.println("La nota: " + nota + " es suficiente");
                } else {
                    System.out.println("La nota: " + nota + " bien");
                }
            }
        }
    }

    public static void ejercicio_6() {
        //Leer un número e indicar si es positivo o negativo. El proceso se repetirá
        //hasta que se introduzca un 0
        int num;
        System.out.println("Ingrese un valor");
        num = leer.nextInt();
        while (num != 0) {

            if (num > 0) {
                System.out.println("El numero " + num + " es positivo");
                break;
            } else {
                System.out.println("El numero " + num + " es negativo");
                break;
            }
        }

    }

    public static void ejercicio_7() {
        //Leer un número y mostrar su cuadrado, repetir el proceso hasta que 
        //se introduzca un número negativo
        int num, potencia;
        System.out.println("Ingresar un valor para calcular la potencia cuadrada");
        num = leer.nextInt();
        while (num < 0) {
            break;
        }
        potencia = num * num;
        System.out.println("El valor de la potencia es: " + potencia);

    }

    public static void ejercicio_8() {
        //Pedir números hasta que teclee uno negativo, y mostrar cuántos números se ha introducido. 
        int num, i = 0;
        do {
            System.out.println("Ingresar valores");
            num = leer.nextInt();
            if (num >= 0);
            i++;
        }while (num >= 0);
        System.out.println("Has introducido " + i + "números positivos");
    }

    public static void ejercicio_9() {
        //Realizar un juego para adivinar un número, para ello pedir un número N, y luego ir pidiendo
        //números indicando"mayor" o "menor" según sea mayor o menor con respecto a N. El proceso termina
        //cuando el usuario acierta. 
        int n, num;
        n = (int) (Math.random() * 100);
        System.out.println("Ingresar un num y adivina: ");
        num = leer.nextInt();
        while (num != n) {
            if (num > n) {
                System.out.println("dEBES INGRESAR UN NÚMERO MENOR");
            } else {
                System.out.println("Debes ingresar un número mayor");
            }
            System.out.println("Advinaste el número");
        }
        //public static void Ejercicio_10() {
        //Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos. 
    }

}
