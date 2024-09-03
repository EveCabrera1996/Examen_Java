/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CirculoArea {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*Pedir el radio de un círculo y calcular su área: A=PI*r^2. 
         */
        double a, r;
        /*area y radio*/
        System.out.println("Introduce el valor del radio de un círculo");
        r = leer.nextFloat();
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
    }
}
