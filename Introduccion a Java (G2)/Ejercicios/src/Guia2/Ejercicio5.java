/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        System.out.println("Ingrese un numero");
        System.out.println("El doble del numero es:" + num*2);
        System.out.println("El triple del numero es: " + num*3);
        double resultado = Math.sqrt(num);
        System.out.println("La raiz cuadrada es: " + resultado);
    }
}
