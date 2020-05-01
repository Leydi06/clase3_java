
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leydi
 */
public class caso12guia2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String empleado = "";
        int nivel = 0;
        float sueldo = 0;
        
        System.out.print( "Nombre de empleado: ");
        empleado = sc.nextLine();
        //Leydi arce
        System.out.print("Nivel[1-4]: ");
        nivel = sc.nextInt();
        
        System.out.print("Sueldo: ");
        sueldo = sc.nextFloat();
        
        float inc = 0;
        
        switch (nivel){
            case 1:
                inc = 0.045f;break;
            case 2:
                inc = 0.06f;break;
            case 3: 
                inc = 0.085f;break;
            case 4:
                inc = 0.11f;break;
                
        }
        float nuevosueldo = sueldo *(1 + inc);
        
        System.out.println("Nuevo sueldo: "+ nuevosueldo);
    }      
}
