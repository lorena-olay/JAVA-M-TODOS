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
    //método para pedir un número entero y controla que si es un número entero
    public static int pedirNumeroEntero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean seguir = true;
        do {
            try {
                JOptionPane.showMessageDialog(null, "Escribe el número entero");
                numero = sc.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "eso no es un número entero");
                sc.nextLine();
            }
        } while (seguir);
        return numero;

    }
    //método para número aleatorio entre 2 números, el primero tiene que ser mayor que el segundo
    public static int numeroAleatorioEntre(int numero, int numero1) {
        Random numAleatorio = new Random();
        int numeroAleatorio = numAleatorio.nextInt(numero - numero1 + 1) + numero1;
        //System.out.println("Numero aleatorio " + numeroAleatorio);
        return numeroAleatorio;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //condicional para saber si el número aleatorio generado por la máquina 
        //es igual que lo que introduce el usuario
        if(numeroAleatorioEntre(100, 0)==pedirNumeroEntero()){
            System.out.println("HAS ACERTADO!");
        }else{
            System.out.println("PERDISTE");
        }
    }

}
