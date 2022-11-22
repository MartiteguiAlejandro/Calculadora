package calcu;
import java.util.Scanner;
public class calculadora {
	public static void main (String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num1,num2;
		int resultado = 0;
		int eleccion;
		System.out.println("Introduce un número: ");
		num1=teclado.nextInt();
		System.out.println("Introduce otro número: ");
		num2=teclado.nextInt();
		System.out.println("-----------------------------------------------");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("-----------------------------------------------");
		eleccion=teclado.nextInt();
		
		if(eleccion==1) {
			//diego
		}else if(eleccion==2) {
			//diego y juan
		}else if(eleccion==3) {
			
		}else if(eleccion==4) {
			
		}else
			System.out.println("No has introducido un numero valido");
		
		System.out.println("El resultado de la operación es: " + resultado);
		
		
		
	}
}
