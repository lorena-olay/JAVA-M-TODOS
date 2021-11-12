/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author lorena
 */
public class GENERANUMALEATORIO {

    public static int pedirNumeroEntero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean seguir = true;
        do {
            try {
                JOptionPane.showMessageDialog(null, "Escribe el primer número entero");
                numero = sc.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "eso no es un número entero");
                sc.nextLine();
            }
        } while (seguir);
        return numero;

    }

    public static int pedirNumeroEntero1() {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        boolean seguir = true;
        do {
            try {
                JOptionPane.showMessageDialog(null, "Escribe el segundo número entero");
                numero1 = sc.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "eso no es un número entero");
                sc.nextLine();
            }
        } while (seguir);
        return numero1;

    }

    public static int numeroAleatorioEntre(int numero, int numero1) {
        Random numAleatorio = new Random();
        int numeroAleatorio = numAleatorio.nextInt(numero - numero1 + 1) + numero1;
        System.out.println("Numero aleatorio " + numeroAleatorio);
        return numeroAleatorio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numeroAleatorioEntre(pedirNumeroEntero(), pedirNumeroEntero1());
    }

}
