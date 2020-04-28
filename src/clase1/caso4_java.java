/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author leydi
 */
import java.util.Scanner;
public class caso4_java {
    
    public static void main(String[]args){
        //Instancia
        Scanner sc = new Scanner(System.in);
        
        //definir la variables
        float n1 = 0;
        float n2 = 0;
        System.out.println("Primer numero: ");
        n1 = sc.nextFloat();
        System.out.println("Segundo numero: ");
        n2 = sc.nextFloat();
        
        float suma ,resta ,producto , division ,resto;
        suma = n1+ n2;
        resta = n1 - n2;
        producto = n1 * n2;
        division = n1 / n2;
        resto = n1 % n2;
       
        
        System.out.println("--------RESULTADOS----");
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Producto: "+producto);
        System.out.println("division: "+ division);
        System.out.println("resto entero: "+ resto);
        
         
    }
}
