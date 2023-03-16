package random;

import java.util.Scanner;

public class PracticaForWhile {
	
	
	public static void main(String[]Args) {
		
		
		
		//Ciclo FOR. El ciclo lo que hace es "Iterar" X veces algo, hasta que una condicion se cumpla.
		
		/** palabra clave*/for (/**condicion*/int i = 0/**se crea una variable*/; i<10;/**mientras que i sea menor a 10*/) 
		{/**se abre el cuerpo con las {}*/
			/**has esto*/ System.out.println(i); /**Imprime por consola, valor de i*/ 
			i++;/**por cada iteracion suma 1 a i*/
		}
		
		for(int s = 0; s<10;) {
			System.out.print(" "+s+" segundo");
			s+=2;
		}
		
		// Ciclo WHILE. El ciclo while, es decir que se va a repetir algo, hasta que una condicion se cumpla. si no se le pasa la condicon de salida
		//seguira repitiendo.
		
		boolean ok = false; /**la variable de condicion....o condicion misma, SIEMPRE ESTA FUERA DEL WHILE*/
		while/**palabra clave*/(/**condicion*/!ok /**<--se "repetira" mientras la variable booleana en ese caso, no cambie*/)
		{/**abrir cuerpo*/
			int i = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("ingrese un valor");
			i = sc.nextInt();
			if(i==10) { /**si valor de i llega a 10*/
				ok = true; /**condicion de booleano ok pasa a ser true*/
				System.out.println(i+"el valor ha llegado a la condicion y como el programa no tiene mas que hacer. se termina");
			}
	
		}
		/** ! <-- el signo de exclamacion al ponerse delante de algo, infiere que esto es el inverso o distinto de*/
		boolean ej2 = false;
		while (!ej2) {
			int s = 0;
			for(int i = 0; i<10; i++) {
				s++;
				System.out.println(s);
				if(s==9) {
					ej2 = true;
					System.out.println(s+" se llego a los 10 segundos aumentados por el for, por tanto el IF se cumple y da cambia el booleano"
							+ "terminando asi el el ciclo While");
				}

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
