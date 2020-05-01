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
public class caso14 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Alumno:  ");
        String alumno = sc.nextLine();
        
        System.out.print("Carrera <DS/RC/DG>:  ");
        String carrera = sc.nextLine();
        
        System.out.print("Turno <M/T/N>:  ");
        String turno = sc.nextLine();
        
        String nombre_carrera = "" ,nombre_turno= "";
        float monto = 0, dscto = 0, total = 0;
        switch (carrera){
            case "DS":
                nombre_carrera = "Desarrollo de Software";
                monto = 1500;
                break; 
            case "RC":
                nombre_carrera = "Redes y Conectividad";
                monto = 1400;
                break;
            case "DG":
                nombre_carrera = "Diseño Grafico";
                monto = 1300;
                break;
        }
        switch (turno){
            case "M":
                nombre_turno = "Mañana";
                dscto = 0.1f;
                break;
            case "T":
                nombre_turno = "Tarde";
                dscto = 0.2f;
                break;
            case "N":
                nombre_turno = "Noche";
                dscto = 0.15f;
                break;
        }
        int rpta2 = (int) ((int) monto - (monto *dscto));
         System.out.println("--------RESULTADOS----");
         System.out.println("Alumno: "+alumno);
         System.out.println("Carrera: "+nombre_carrera);
         System.out.println("monto: "+monto);
         System.out.println("Turno: "+nombre_turno);
         System.out.println("Descuento: "+(monto * dscto));
         System.out.println("Total a pagar: "+ rpta2);
         System.out.println("Total en dolares: " + (rpta2 /3.33));
         
        
     }  
}
