import java.util.Scanner;
public class clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer numero: ");
		int n1 = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
        int n2 = sc.nextInt();
        if (n1 == n2)
        	System.out.println("Los numero son iguales");
        else
        	if (n1 > n2)
        		System.out.println("El primer numero es mayor");
        	else
        		System.out.println("El segundo numero es mayor");
        
            
            
        
	}

}
