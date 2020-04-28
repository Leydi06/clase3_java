/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leydi
 */
import java.util.Scanner;
public class caso17 {
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese numero de aprobados: ");
		float aprobados = sc.nextFloat();
		System.out.print("Ingrese el numero de desaprobados: ");
		float desaprobados = sc.nextFloat();
		System.out.print("Numero de retirados: ");
                float retirados = sc.nextFloat();
		float a = (float) 100/(aprobados+ desaprobados + retirados);
	        double b = (float)(a * aprobados);
		double c = (float)(a * desaprobados);
		float d = (float)(a * retirados);
                System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Resultados");
		System.out.println("_ _ _ _ _ _ __ _ _ ");
		System.out.println("Aprobados: "+ b );
		System.out.println("Desaprobados: "+ c);
		System.out.println("Retirados: "+ d);
    }   
}
