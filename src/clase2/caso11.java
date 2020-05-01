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
public class caso11 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int numerodia = 0;
        System.out.print("Ingrese numero¨{1-7}: ");
        numerodia = sc.nextInt();
        
        String nombredia = "";
        
        switch (numerodia){
            case 1:
                nombredia = "Domingo";
                break;
            case 2:
                nombredia = "Lunes";
                break;
            default:
                nombredia = "Desconocido";
        }
        System.out.println("Nombre del dia: "+ nombredia);
                
        }
    }
    

