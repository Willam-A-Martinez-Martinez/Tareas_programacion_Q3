/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_programacion;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Martinez_william_investigacion_ternario {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        int valor=20;
        double paga=0;
        //Se explicara lo que se va hacer y que es un operador ternario
        System.out.println(("En el siguiente programa se va a mostrar 3 ejemplos sobre la utilizacion del operador ternario de java.")+
        ("\nAntes empezar que es un operador ternario en java? un operador")+
        ("\nExplicacion")+
        ("\n")+
        ("\nEl operador ternario es una forma concisa de escribir una declaración if-else en una sola línea. Se compone de tres partes:")+
        ("\nLa condición a evaluar (condición booleana)")+
        ("\nEl valor si la condición es verdadera (valor verdadero)")+
        ("\nEl valor si la condición es falsa (valor falso)")+
        ("\n")+
        //Ejemplo 1
        ("\n------------------EJEMPLO NUMERO 1:")+
        ("\nEn este ejmplo utilizaremos un valor constante donde preguntaremos una pregunta especifica y dependra el resultado de lo escrito en el teclado")+
        ("\nEs 10+10=20?"));
        int cantidad=lea.nextInt();
        String respuesta=(cantidad==valor)?"CORRECTO! 10+10 es igual a 20":"INCORRECTO 10+10 NO ES "+cantidad;
        System.out.println((respuesta)+
        ("\n")+
        //Ejemplo 2
        ("\n------------------EJEMPLO NUMERO 2:")+
        ("\nEn el siguiente ejemplo utilizaremos una variable")+
        ("\nIngrese nota: "));
        double nota=lea.nextDouble();
        String calificacion=(nota>=70)?"Has pasado la clase! aprovado":"No has pasado la clase! no aprovado";
        System.out.println((calificacion)+
        ("\n")+
        ("\n------------------EJEMPLO NUMERO 3:")+
        ("\nEn el siguiente ejemplo utilizaremos formulas")+
        ("\nIngrese horas trabajadas: "));
        int horaXTrabajo=lea.nextInt();
        System.out.println("Ingrese tarifa por hora");
        double tarifa=lea.nextDouble();
        paga=horaXTrabajo*tarifa;
        String cuota=(paga>=1000)?"Has cumplido con la cuota!":"No has cumplicado con la cuota! despedido";
        System.out.println(cuota);
    }
}
