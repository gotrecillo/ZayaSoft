import java.util.Scanner;


public class Main {
	
	public static void main (String[] args){
		String options = "�Qu� operaci�n quieres realizar?\n1 - Suma\n2 - Resta\n3 - Multiplicaci�n\n4 - Divisi�n\n0 - Salir del programa ";
		String wrongOption = "Opci�n incorrecta";
		String wrongDivision = "No se puede dividir entre cero cara chancla";
		String oneNumber = "Introduce un n�mero";
		String anotherNumber = "Introduce otro n�mero";
		String result = "El resultado es: ";
		String thanks = "Muchas gracias por usar la cacalculadora";
		
		int option, x, y;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(options);
			option = sc.nextInt();
			if ((option < 0) || (option > 4)) {
				System.out.println(wrongOption);
			}else if (option != 0){
				System.out.println(oneNumber);
				x = sc.nextInt();
				System.out.println(anotherNumber);
				y = sc.nextInt();
				switch (option) {
				case 0:
					break;
				case 1:
					System.out.println(result + Modulo2.suma(x, y) + "\n");
					break;
				case 2:
					System.out.println(result + Modulo2.resta(x, y) + "\n");
					break;
				case 3:
					System.out.println(result + Modulo2.multiplicacion(x, y) + "\n");
					break;
				case 4:
					if (y == 0){
						System.out.println(wrongDivision + "\n");
					}else{
						System.out.println(result + Modulo2.division(x, y) + "\n");
					}
					break;
				}
			}
		} while (option != 0);
		System.out.println(thanks);
		sc.close();
	}
}
