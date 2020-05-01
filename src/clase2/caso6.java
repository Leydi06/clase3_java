import java.util.Scanner;
public class caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		int sueldo = sc.nextInt();
		float imp = 0;
		if (sueldo > 2800)
			imp = (float)0.05 * sueldo;
		else
			imp = (float) 0.02 * sueldo;
		System.out.println("Impuesto calculado:"+ imp);
			

	}

}
