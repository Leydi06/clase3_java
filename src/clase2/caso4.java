import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer numero: ");
		int p1 = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
        int p2 = sc.nextInt();
        if (p1 == p2)
        	System.out.println("Los numero son iguales");
        else
        	if (p1 > p2)
        		System.out.println("El segundo numero es menor");
        	else
        		System.out.println("El primer numero es menor");

	}

}
