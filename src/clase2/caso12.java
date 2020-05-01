/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author leydi
 */
import java.util.Scanner;
public class caso12 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        String empleado = "";
        int nivel = 0;
        float sueldo = 0;
        
        System.out.print("Nombre de empleado: ");
        empleado = sc.nextLine();
        
        System.out.print("Nivel [1-4]: ");
        nivel = sc.nextInt();
        
        System.out.print("Sueldo: ");
        sueldo = sc.nextFloat();
        
        float inc = 0;
        
        switch (nivel){
            case 1:
                inc = 0.045f;
                break;
            case 2:
                inc = 0.06f;
                break;
            case 3 :
                inc = 0.085f;
                break;
            case 4:
                inc = 0.11f;
                break;
            default:
                inc = 0f;
                        
        }
         System.out.println("_ _ _ _ _ _ _");
	  System.out.println("Resultados" );  
	  System.out.println("_ _ _ _ _ _ _");
	  System.out.println("Empleado: " + empleado);
	  System.out.println("Nivel: "+ nivel);
          System.out.println("Sueldo: "+sueldo);
	  System.out.println("Incremento: "+ inc);
          System.out.println("Nuevo Sueldo: ");
      }
        
    }

