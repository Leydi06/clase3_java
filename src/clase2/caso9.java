import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      String alumno = "";
      int n1 = 0 , n2 = 0;
      float asist = 0;
      
      System.out.print("Ingrese nombre de alumno: ");
	  alumno = sc.nextLine();
	  System.out.print("Ingrese primera nota: ");
	  n1 = sc.nextInt();
	  System.out.print("Ingrese segunda nota: ");
	  n2 = sc.nextInt();
	  System.out.print("Ingrese numero de asistencias: ");
	  asist = sc.nextFloat();
	  
	  float nota1 = n1 * 30;
	  float nota2 = n2 * 70;
	  float prom = nota1 + nota2 ;
      float asisten = (asist *100) /12; 
	  
	  if ( prom >=13 && asisten >= 70) {
	  System.out.println("_ _ _ _ _ _ _");
	  System.out.println("Resultados" );  
	  System.out.println("_ _ _ _ _ _ _");
	  System.out.println("Alumno: " + alumno);
	  System.out.println("Promedio: "+ prom );
	  System.out.println("Asistencia: "+ asisten);
	  System.out.println("Estado: Aprobado");
	  }
	  else {
	  System.out.println("_ _ _ _ _ _ _");
	  System.out.println("Resultados" );  
	  System.out.println("_ _ _ _ _ _ _");
	  System.out.println("Alumno: " + alumno);
	  System.out.println("Promedio: "+ prom);
	  System.out.println("Asistencia: "+ asisten+ "%");
	  System.out.println("Estado: Desaprobado");
          }
		  
		
		

	}

}
