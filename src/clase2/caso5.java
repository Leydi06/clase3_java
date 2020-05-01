import java.util.Scanner;
public class caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Cantidad: ");
		int p1 = sc.nextInt();
                
		System.out.print("Ingrese Precio: ");
		float precio = sc.nextFloat();
                
		float total= p1* precio;
                float dscto = 0;
                
                if (p1 > 8)
                    dscto = (float)0.1 * total;
                System.out.println("total: "+ total );
		System.out.println("Descuento: " + dscto );
		System.out.println("Neto:  "+ (total - dscto) );
	}

}
