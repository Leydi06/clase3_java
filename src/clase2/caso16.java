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
public class caso16 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese cliente:  ");
        String cliente = sc.nextLine();
        
        System.out.print("Producto <TB/LT/MN/IM>:  ");
        String producto = sc.nextLine();
        
        System.out.print("Forma de pago <C1/C2>:  ");
        String pago = sc.nextLine();
        
        System.out.print("Cantidad:  ");
        int cantidad = sc.nextInt();
        
        String nombre_producto = "" ,forma_pago= "";
        float monto = 0, dscto = 0, inc = 0;
        
        switch (producto){
            case "TB":
                nombre_producto = "Tablet";
                monto = 350;
                break;
            case "LT":
                nombre_producto = "Laptop";
                monto = 2300;
                break;
            case "MN":
                nombre_producto = "Monitor";
                monto = 850;
                break;
            case "IM":
                nombre_producto = "Impresora";
                monto = 680;
                break;        
        }
        switch (pago){
            case "C1":
                    forma_pago = "Contado";
                    dscto = 0.05f;
                    break;
            case "C2":
                    forma_pago = "Credito";
                    inc = 0.12f;
                    break;    
        }
        
        float rpta1 = monto * cantidad;
        float rpta2 =(monto * cantidad) * dscto;
         System.out.println("--------RESULTADOS----");
         System.out.println("Cliente: "+cliente);
         System.out.println("Producto: "+nombre_producto);
         System.out.println("Precio: "+monto);
         System.out.println("Cantidad : "+cantidad);
         System.out.println("Importe : "+ rpta1);
         System.out.println("Forma de pago: "+forma_pago);
         System.out.println("Incremento: " + rpta2);
         System.out.println("Total a pagar: "+ (rpta1 - rpta2));
    }       
}
