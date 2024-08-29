/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class William_Martinez_Prueba1P2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        Random rnd = new Random();
        String palabraReversa="";
        String palabras[ ] = { "radar", "level", "world", "civic", 
        "java", "deified", "python", "rotor", 
        "language", "madam", "refer", "stats", 
        "noon", "hello", "moon", "wow", "racecar", 
        "kayak", "apple", "deed" },
        listaA[],listaB[];
        int contadorCant=0;

        System.out.println("-------------Prueba 1 Parcial 2-------------");
        for(int contador=0; contador<palabras.length;contador++){
            System.out.println("["+contador+"]: "+palabras[contador]);
        }
        System.out.println("Ingrese el largo de los arreglos A y B: ");
        int tamaño=lea.nextInt();
        while(tamaño>20 || tamaño<1){
            System.out.println("Error no ingrese valores mayores a 20 ni menores o iguales a 0. \nIngrese el largo de los arreglos A y B: ");
            tamaño=lea.nextInt();
        }
        
        listaA=new String[tamaño];
        listaB=new String[tamaño];
        System.out.println("hola");
        //Asignar las palabras a cada lista y que cada palabra sea random al ser asignado y que sean palindromas
        while(contadorCant<tamaño*2){
            int numR= rnd.nextInt(20);
            String palabraR = palabras[numR];
            for(int i=palabraR.length()-1 ; i>=0 ; i--){
                char letra=palabraR.charAt(i);
                palabraReversa+=letra;
            }
            palabraReversa="";
            int tamañoA=tamaño*2;
            if(palabraReversa.equalsIgnoreCase(palabraR) && contadorCant<(tamañoA-tamaño)){
                contadorCant++;
                listaA[contadorCant]="["+numR+"]: "+palabraReversa;
            }
            else if(palabraReversa.equalsIgnoreCase(palabraR) && contadorCant>(tamañoA-tamaño) && contadorCant<tamañoA){
                contadorCant++;
                listaB[contadorCant-tamaño]="["+numR+"]: "+palabraReversa;
            }
        }
        System.out.println("Lista A: ");
        for(int contador=0; contador<listaA.length;contador++){
            System.out.println("["+contador+"]: "+listaA[contador]);
        }
        System.out.println("Lista B: ");
        for(int contador=0; contador<listaB.length;contador++){
            System.out.println("["+contador+"]: "+listaB[contador]);
        }
    }
}
