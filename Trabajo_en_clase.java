package progra1;

import java.util.Scanner;

public class Trabajo_en_clase {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in).useDelimiter("\n");
        
        int cantidadTri=8, numTri=0, numEval=2;
        double areaTri=0, mayorTri=0;
        
        while(true){
            System.out.println("1- Ejercicio 1"
                    + "\n2- Ejercicio 2"
                    + "\n3- Ejercicio 3"
                    + "\n4- Salir del programa"
                    + "\nIngrese una de las siguientes opciones:");
            int opcion=lea.nextInt();
            
            if(opcion==4){
                System.out.println("-----------------Programa finalizado-----------------");
                break;
            }
            else if(opcion>4 && opcion<1){
                System.out.println("Ingrese una opcion de las que se ofrecen 1-4");
            }
            else if(opcion==1){
                System.out.println("------------------El triangulo mas grande------------------");
                
                for(int i=1;cantidadTri>=i;i++){
                    System.out.println("Triangulo #"+i
                    +"\nBase: ");
                    double base=lea.nextInt();
                    
                    while(base<=0){
                        System.out.println("Error. Solo se pede ingresar numeros positivos\nBase:");
                        base=lea.nextInt();
                    }
                    
                    System.out.println("Altura: ");
                    double altura=lea.nextInt();
                    
                    while(base<=0){
                        System.out.println("Error. Solo se pede ingresar numeros positivos\nAltura:");
                        altura=lea.nextInt();
                    }
                    
                    areaTri=0.5*base*altura;
                    
                    System.out.println("Area del triagulo #"+i+": "+areaTri);
                    
                    if(mayorTri<areaTri){
                        mayorTri=areaTri;
                        numTri=i;
                    }
                }
                System.out.println("Mayor triangulo #"+numTri+": "+mayorTri);
                
            
            }
            
            else if(opcion==2){
                System.out.println("--------------Minimo comun multiplo y Maximo comun divisor--------------");
                
                for(int index=1;numEval>=index;index++){
                    System.out.println("Ingresar numero #"+index+":");
                    int numero=lea.nextInt();
                    
                    
                }
                
            }
        }
    }
}
