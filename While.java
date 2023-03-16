package random;

import java.util.Scanner;

public class While {

	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int edad = pedirEdad(sc);/**crear variable edad del tipo int(entero) y le pedimos que se use la funcion
		pedir edad para poder asignarle un valor*/
		
		System.out.println("el valor entonces de edad es: "+edad);/**muestra por consola, el valor de edad*/
		
		String fecha = fechaI();
		
		System.out.println("la fecha de ingreso entonces es: "+fecha);
		
	}
	
	
	public static int pedirEdad(Scanner sc) {
		boolean edadOk = false;
		int edad = 0;
		while (!edadOk) {
			System.out.println("Favor ingrese Edad:");
			String entrada = sc.nextLine();
			if(!entrada.matches("\\b(?:[1-9]|1\\d|20)\\b"/**si entrada NO Coincide con este regex*/)) {/**si no coicide..va a repetir*/
				System.out.println("Edad solo debe contener numeros. Maximo 150 anios");/**despliega este mensaje*/
			} else {/**si coincide...entonces...*/
	            edad = Integer.parseInt(entrada); /**al int edad, pasale el siguiente valor. convierte entrada de
	             String a int y asignalo*/
	            edadOk = true; /**por ultimo, cambia el booleano a true y termina este ciclo*/
	        }
		}
		return edad;/**retorna entonces a quien te lo pidiera, el valor de edad*/
	}
	
	public static String fechaI() {
		System.out.println("Ingrese Fecha de Ingreso:");
		return fDia()+"/"+fMes()+"/"+fAnio();
	}
	
	public static String fDia() {
		boolean fechaOk = false;
		String fDia = "";
		while(!fechaOk) {
			System.out.println("Ingrese Dia:");
			fDia = sc.nextLine();
			if (!fDia.matches("([1-9]|[1-2][0-9]|3[0-1])")) {
				System.out.println("Ingrese un dia de valido. De 01 a 31 (favor recuerde Febrero tiene hasta 28 o 29)");
			} else {
				fechaOk = true;
			}	
		}
		return fDia;
	}
	public static String fMes() {
		boolean fechaOk = false;
		String fMes = "";
		while(!fechaOk) {
			System.out.println("Ingrese Mes:");
			fMes = sc.nextLine();
			if (!fMes.matches("0[1-9]|1[0-2]")) {
				System.out.println("Ingrese un mes Valido. De 01 a 12");
			} else {
				fechaOk = true;
			}	
		}
		return fMes;
	}
	public static String fAnio() {
		boolean fechaOk = false;
		String fAnio = "";
		while(!fechaOk) {
			System.out.println("Ingrese Año:");
			fAnio = sc.nextLine();
			if (!fAnio.matches("19\\d{2}|20\\d{2}|2100")) {
				System.out.println("Ingrese un anio valido. Desde 1900 a 2100 .... no se aceptan vampiros, inmortales y gente del futuro");
			} else {
				fechaOk = true;
			}	
		}
		return fAnio;
	}
		
		
	//"1[0-9]{2}|[1-9][0-9]|\\b[1-9]\\b|150"

}
