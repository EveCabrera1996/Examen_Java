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
public class Numpositivonegativo {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //Numpositivonegativo.Sueldos();
        //Numpositivonegativo.factura();
    }

    public static void mediapositivosnegativos() {
        int num;
        int cont_ceros; // el contador de ceros
        int cont_pos; // contador de positivos
        int cont_neg; // contador de negativos
        int suma_pos, suma_neg; // suma de los números positivos y negativos
        float media_pos, media_neg; // las medias 8positivas y negativa9 pueden tener decimales
        cont_ceros = 0;
        cont_pos = 0;
        cont_neg = 0;
        suma_pos = 0;
        suma_neg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce número: ");
            num = leer.nextInt();
            if (num == 0) {
                cont_ceros++;
            } else {
                if (num > 0) {
                    cont_pos++;
                    suma_pos += num;
                } else {
                    cont_neg++;
                    suma_neg += num;
                }
            }
        }
// tratamos los ceros
        System.out.println("El número de ceros introducidos es de: " + cont_ceros);
//Tratamos los positivos
        if (cont_pos == 0) {
            System.out.println("No se puede hacer la media de los positivos");
        } else {
            media_pos = (float) suma_pos / cont_pos;
            System.out.println("Media de los positivos: " + media_pos);
        }
// tratamos los negativos
        if (cont_pos == 0) {
            System.out.println("No se puede hacer la media de los negativos");
        } else {
            media_neg = (float) suma_neg / cont_neg;
            System.out.println("Media de los negativos: " + media_neg);
        }
    }

    public static void Sueldos() {
        int sueldo, suma, mayor_1000;
        suma = 0;
        mayor_1000 = 0;
        for (int i = 1; i < 10; i++) {
            System.out.print("Escribe un sueldo: ");
            sueldo = leer.nextInt();
            if (sueldo > 1000) {
                mayor_1000++;
            }
            suma = suma + sueldo;
        }
        System.out.println("Mayores de 1000 hay: " + mayor_1000);
        System.out.println("la suma es de: " + suma);
    }

    public static void factura() {
        int c, l, litros_cod, mas600;
        float precio, importefac, valortot;

        valortot = 0;
        litros_cod = 0;
        mas600 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura nº " + i);
            System.out.print("código de producto: ");
            c = leer.nextInt();
            System.out.print("cantidad (litros): ");
            l = leer.nextInt();
            System.out.print("precio (litro): ");
            precio = (float) leer.nextFloat();
            importefac = l * precio;
            valortot += importefac;
            if (c == 1) {
                litros_cod += l;
            }
            if (importefac >= 600) {
                mas600++;
            }
        }

    }

}
