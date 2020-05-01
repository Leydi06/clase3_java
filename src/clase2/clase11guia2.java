
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
public class clase11guia2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese numero: ");
        int n = sc.nextInt();
        
        String dia = "";
        
        switch(n){
            case 1:
                dia = "Domingo" ; break;
            case 2:
                dia = "Lunes" ; break;
            case 3 :
                dia = "Martes"; break;
            case 4:
                dia = "Miercoles" ; break;
            case 5:
                dia = "Jueves" ; break;
            case 6 :
                dia = "Viernes"; break;
             case 7 :
                dia = "Sabado"; break;
            default:
                dia ="Dia desconocido";
        }
        System.out.println("Dia : "+ dia);
                
             
        }
    }
    

