/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicios {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int opcion,contador=1,cont=0;
        String espacio="",space="",palabraP,palabrasP="",palabrasNP="";
        char letra;
        
        do{
            System.out.println("-----------MENU-----------"+
                    "\n1- Ejercicio 1"+
                    "\n2- Ejercicio 2"+
                    "\n3- Ejercicio 3"+
                    "\n4- Salir del programa:");
            opcion=lea.nextInt();
            if(opcion==1){
                System.out.println("Ingrese una palabra: ");
                String palabra=lea.next();
                
                for(int i=0;i<palabra.length();i++){
                    letra=palabra.charAt(i);
                    System.out.println(espacio+letra);
                    espacio+=" ";
                }
                
            }
            
            if(opcion==2){
                System.out.println("Ingrese fila: ");
                int numero=lea.nextInt();
                for(int p=1;p<=numero;p++){
                    
                    for(int index=contador;index<=numero;index++){
                        System.out.print(index+" ");
                        
                        if(index==numero){
                            
                            for(int n=numero-1;n>contador-1;n--){
                                System.out.print(n+" ");
                            } 
                        }
                    }
                    
                    space+="  ";
                    System.out.print("\n"+space);
                    contador++;
                    
                }
            }
            
            else if(opcion==3){
                System.out.println("---------------Ejercicio palabra palindroma---------------"+
                "\nIngrese cantidad de palabras: ");
                int cantWords=lea.nextInt();
                String palabraRev="";
                while(cantWords>cont){
                    System.out.println("Ingrese palabra");
                    palabraP=lea.next();
                    
                    for(int i=(palabraP.length()-1);i>=0;i--){
                        palabraRev+=palabraP.charAt(i);
                    }
                    if(palabraRev.equalsIgnoreCase(palabraP)){
                        palabrasP+="\n"+palabraP;
                    }
                    else if(!palabraRev.equalsIgnoreCase(palabraP)){
                        palabrasNP+="\n"+palabraP;
                    }
                    cont++;
                    palabraRev="";
                }
                
                System.out.println("Palabras palindromas"
                        + palabrasP
                        + "\nPalabras no palindromas"
                        + palabrasNP);
                
            }
        }while(opcion!=4);
    }
}
