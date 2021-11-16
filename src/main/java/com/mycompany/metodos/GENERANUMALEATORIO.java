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
                System.out.println("Escribe un número");
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
    /*hacer que el mayor sea el primero, catch*/
    public static int numeroAleatorioEntre(int numero, int numero1) {
        Random numAleatorio = new Random();
        int numeroAleatorio;
        /*
        if(numero>numero1){
            int puesto1 = numAleatorio.nextInt(numero - numero1 + 1) + numero1;
        }else{
            int puesto2 = numAleatorio.nextInt(numero1 - numero + 1) + numero;
        }
        */
        //Scanner sc = new Scanner(System.in);
        //boolean seguir = true;
        /*
        do {
            try {
                numeroAleatorio = numAleatorio.nextInt(numero - numero1 + 1) + numero1;
                seguir = false;
            } catch (IllegalArgumentException ime) {
                numeroAleatorio = numAleatorio.nextInt(numero1 - numero + 1) + numero;
                sc.nextLine();
            }
        } while (seguir);
         */
        //System.out.println("Numero aleatorio " + numeroAleatorio);
        
        if (numero > numero1) {
            numeroAleatorio = numAleatorio.nextInt(numero - numero1 + 1) + numero1;
        } else {
            numeroAleatorio = numAleatorio.nextInt(numero1 - numero + 1) + numero;
        }
        
        return numeroAleatorio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int intentosMax = 3;
        int contadorIntentos = 0;
        int numeroAleatorio, numero;
        numeroAleatorio = numeroAleatorioEntre(0, 10);
        // TODO code application logic here
        /*
        condicional para saber si el número aleatorio generado por la máquina 
        es igual que lo que introduce el usuario
         */
        //bucle para los intentos del juego
        do {
            numero = pedirNumeroEntero();
            if (numeroAleatorio == numero) {
                System.out.println("HAS ACERTADO!");
                //una vez que ha acertado se para el juego
                break;
            } else {
                System.out.println("PERDISTE");
                if (numeroAleatorio < numero) {
                    System.out.println("Pista");
                    System.out.println("El número es menor");
                } else {
                    System.out.println("Pista");
                    System.out.println("El número es mayor");
                }
            }
            contadorIntentos++;
        } while (contadorIntentos != intentosMax);
        System.out.println("El número aleatorio era " + numeroAleatorio);
        System.out.println("FIN DEL JUEGO");
    }

}
