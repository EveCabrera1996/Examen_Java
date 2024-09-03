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
public class Fechas {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
Sin años bisiestos.*/
        int d, m, a;
        System.out.println("Ingresa el día: ");
        d = leer.nextInt();
        System.out.println("Ingresa el mes: ");
        m = leer.nextInt();
        System.out.println("Ingresa el año: ");
        a = leer.nextInt();

        if (a == 0) {
            System.out.println("fecha incorrecta");
        } else {
            if (m == 2 && (d >= 1 && d <= 28)) {
                System.out.println(d + "/" + m + "/" + a + ": Fecha correcta");
            } else {
                if ((m == 4 || m == 6 || m == 9 || m == 11)
                        && (d >= 1 && d <= 30)) {
                    System.out.println(d + "/" + m + "/" + a + ": Fecha correcta");
                } else {
                    if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
                            && (d >= 1 && d <= 31)) {
                        System.out.println(d + "/" + m + "/" + a + ": Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                }
            }

        }

    }
}
