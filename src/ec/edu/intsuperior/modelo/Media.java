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
public class Media {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*Pedir números hasta que se introduzca uno negativo, y calcular la media.*/
        int num, suma, elementos;
        double media;
        System.out.print("Introduzca un número: ");
        num = leer.nextInt();
        suma = 0;
        elementos = 0;
        while (num >= 0) // nos interesan los positivos y el cero
        {
            suma += num;
            elementos++;
            System.out.print("Introduzca otro número: ");
            num = leer.nextInt();
        }
        if (elementos == 0) // daría un error de división por cero
        {
            System.out.println("Imposible hacer la media");
        } else {
            media = (float) suma / elementos;
            System.out.println("La media es de: " + media);
        }

    }
}
