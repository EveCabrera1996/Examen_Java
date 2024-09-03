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
public class Tablas {
    
    static Scanner leer = new Scanner(System.in);
    
    public static void tabla1() {
        int tabla[];
        tabla = new int[8];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un número: ");
            tabla[i] = leer.nextInt();
        }
        System.out.println("Los números son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(tabla[i]);
        }
    }

    public static void tabla2() {
        /*Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: 
        el primero, el último, el segundo, el penúltimo, el tercero, etc.*/
        int i, t[];
        t = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.print("Introduzca numero: ");
            t[i] = leer.nextInt();
        }
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(t[i]); // mostramos el i-ésimo número por el principio
            System.out.println(t[9 - i]); // y el i-ésimo por el final
        }
    }

    public static void tabla3() {
        /*Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, 
e insertarlo en el lugar adecuado para que la tabla continúe ordenada.*/
        int t[] = new int[10];
        int num, sitio_num, j;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca número (ordenado crecientemente): ");
            t[i] = leer.nextInt();
        }
        System.out.println();
        System.out.print("Número a insertar entre los anteriores: ");
        num = leer.nextInt();
        sitio_num = 0;
        j = 0;
// buscaremos el sitio donde debería ir num
        while (t[j] < num && j <= 4) {
            sitio_num++;
            j++;
        }
        for (int i = 4; i >= sitio_num; i--) {
            t[i + 1] = t[i];
        }
// por último ponemos num en su sitio para que todo siga ordenado
        t[sitio_num] = num;
        System.out.println("La nueva serie ordenada queda: ");
        for (int i = 0; i < 5 + 1; i++) {
            System.out.println(t[i]);
        }
    }
}
