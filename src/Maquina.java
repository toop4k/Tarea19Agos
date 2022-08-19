import java.util.Scanner;

public class Maquina {
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int opcion = -1;
		int cuenta = 0;	
		do {
		System.out.println("                     ");
		System.out.println("---------------------");
		System.out.println("                     ");
		System.out.println("Usted tiene: " + cuenta +"$");
		System.out.println("Elija una opcion: ");
		System.out.println("                     ");
		System.out.println("---------------------");
		System.out.println("                     ");
		System.out.println("1. Introducir 10$  ");
		System.out.println("2. Introducir 50$  ");
		System.out.println("3. Introducir 100$  ");
		System.out.println("                     ");
		System.out.println("---------------------");
		System.out.println("                     ");
		System.out.println("4. Comprar A - 270$  ");
		System.out.println("5. Comprar B - 340$  ");
		System.out.println("6. Comprar C - 390$  ");
		System.out.println("                     ");
		System.out.println("---------------------");
		System.out.println("                     ");
		opcion = Integer.valueOf(teclado.next());
		
		switch (opcion) {
		
		case 1:
			cuenta = cuenta + 10;
			System.out.println("Deposito 10$");	
			break;
		case 2:
			cuenta = cuenta + 50;
			System.out.println("Deposito 50$");
			break;
		case 3:
			cuenta = cuenta + 100;
			System.out.println("Deposito 100$");
			break;
		case 4:
			if (cuenta >= 270){
				System.out.println("Usted compro A");
				cuenta = cuenta - 270;
				if(cuenta> 0) {
					System.out.println("Su vuelto:");
				}
				while (cuenta > 0) {
					if(cuenta>=100){
						System.out.println("100");
						cuenta = cuenta - 100;
					}else if(cuenta >= 50) {
						System.out.println("50");
						cuenta = cuenta - 50;
					}else {
						System.out.println("10");
						cuenta = cuenta - 10;
					}
				}
				opcion = 0;
				System.out.println("Gracias por comprar");
			}else {
				System.out.println("No le alcanza el dinero para comprar A");
			}
			break;
		case 5:	
			if (cuenta >= 340){
				System.out.println("Usted compro B");
				cuenta = cuenta - 340;
				if(cuenta> 0) {
					System.out.println("Su vuelto:");
				}
				while (cuenta > 0) {
					if(cuenta>=100){
						System.out.println("100");
						cuenta = cuenta - 100;
					}else if(cuenta >= 50) {
						System.out.println("50");
						cuenta = cuenta - 50;
					}else {
						System.out.println("10");
						cuenta = cuenta - 10;
					}
				}
				opcion = 0;
				System.out.println("Gracias por comprar");
			}else {
				System.out.println("No le alcanza el dinero para comprar B");
			}
			break;
		case 6:
			if (cuenta >= 390){
				System.out.println("Usted compro C");
				cuenta = cuenta - 390;
				if(cuenta> 0) {
					System.out.println("Su vuelto:");
				}
				while (cuenta > 0) {
					if(cuenta>=100){
						System.out.println("100");
						cuenta = cuenta - 100;
					}else if(cuenta >= 50) {
						System.out.println("50");
						cuenta = cuenta - 50;
					}else {
						System.out.println("10");
						cuenta = cuenta - 10;
					}
				}
				opcion = 0;
				System.out.println("Gracias por comprar");
			}else {
				System.out.println("No le alcanza el dinero para comprar C");
			}
			break;
                    	}
		
		
		
        	}while (opcion !=0);
	}
}
