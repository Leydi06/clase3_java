/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;


/**
 *
 * @author leydi
 */
public class caso13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Primer numero: ");
        float n1 = sc.nextFloat();
        System.out.print("Segundo numero: ");
        float n2 = sc.nextFloat();
        System.out.print("operacion[1-6]: ");
        int operacion = sc.nextInt();
        String nombre = (""); 
        float rpta = 0;
        
        switch (operacion) {
            case 1:
                nombre = "Suma";
                rpta = n1 + n2;
                break;
            case 2 :
                nombre = "Resta";
                rpta = n1 - n2;
                break;
            case 3:
                nombre = "Multiplicacion";
                rpta = n1*n2;
                break;
            case 4:
                nombre = "Division";
                rpta = n1/n2;
                break;
            case 5 :
                nombre = "Restoentero";
                rpta = n1 % n2;
                break;
            case 6:
                nombre = "Promedio";
                rpta = (n1 + n2)/2;
                break;
        }
        
        System.out.println("Primer numero: "+n1);
        System.out.println("Segundo numero: "+n2);
        System.out.println("Operacion: "+ nombre );
        System.out.println("Resultado: "+rpta);
    }
              
    }
 

