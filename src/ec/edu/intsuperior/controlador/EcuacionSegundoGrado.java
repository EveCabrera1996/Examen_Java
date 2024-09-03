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
public class EcuacionSegundoGrado {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.*/
        double a, b, c;
        double x1, x2, d;
        System.out.println("Ingresa el valor de a: ");
        a = leer.nextDouble();
        System.out.println("Ingresa el valor de b: ");
        b = leer.nextDouble();
        System.out.println("Ingresa el valor de c: ");
        c = leer.nextDouble();

        //calculo de determinantes. 
        d = ((b * b) - 4 * a * c);
        if (d < 0) {
            System.out.println("No existen soluciones reales");
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }

    }
}
