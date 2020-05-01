import java.util.Scanner;
public class caso7 {
/// Leydi arce
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Sueldo: ");
		float sueldo = sc.nextFloat();
		float imp = 0;
		
		if (sueldo <= 1500)
			imp = (float)0.03 * sueldo;
		else
			if (sueldo <= 3000)
			    imp = (float) 0.08 * sueldo;	
			else 
				imp = (float) 0.12 * sueldo;
		
		System.out.println("Impuesto: "+ imp);
	}

}
