import java.util.Scanner;
public class caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.println("Numero es par " );
		else
			System.out.println("Numero es impar ");

	}

}
