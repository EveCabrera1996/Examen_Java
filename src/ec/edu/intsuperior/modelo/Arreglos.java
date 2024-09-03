/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Arreglos {

    static Scanner leer = new Scanner(System.in);
    static double lista[];

    public static void dimensionar() {
        int d;
        System.out.println("Ingresa la dimensión de la lista");
        d = leer.nextInt();
        lista = new double[d];
    }

    public static void llenar() {
        Arreglos.dimensionar();
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingresa los valores de la lista");
            lista[i] = leer.nextDouble();
        }
        Arreglos.imprimir();
    }

    public static void imprimir() {
        System.out.println(Arrays.toString(lista));
    }
}