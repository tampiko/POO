import java.util.Scanner;
public class Calculadora {
	public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;
    double num1;
    while(continuar){
			System.out.println("Dime numero 1:");
			double n1 = scanner.nextDouble();
			try{
				num1 = Double.parseDouble(n1);
        break;
			}catch(){
				System.out.println("No es un numero");
			}
			System.out.println("Dime numero 2:");
			double n2 = scanner.nextDouble();
			System.out.println("Numero 1:"+n1);
			System.out.println("Numero 2:"+n2);
			System.out.println("Que operacion quieres hacer:");
			System.out.println("1.- + Suma");
			System.out.println("2.- - Resta");
			System.out.println("3.- * Multiplicacion");
			System.out.println("4.- / Division");
			int operacion = scanner.nextInt();
			double res;
			switch(operacion){
        case 1 :
            res = n1+n2;
            System.out.println("La Suma de "+n1+" + "+n2+" = "+res+".");
            break;
        case 2 : 
            res = n1-n2;
            System.out.println("La Resta de "+n1+" + "+n2+" = "+res+".");
            break;
        case 3 : 
            res = n1*n2;
            System.out.println("La Multiplicacion de "+n1+" + "+n2+" = "+res+".");
            break;
        case 4 : 
            if(n2==0){
                System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO 0");    
            }else{
                res = n1/n2;
                System.out.println("La Division de "+n1+" + "+n2+" = "+res+".");    
            }
            break;
			}
			System.out.println("Continuar: s/n");
			String sigue = scanner.nextLine();
			System.out.println(sigue);
			if(sigue.equalsIgnoreCase("n")){
				System.out.println("NO");
				continuar=false;
			}
		}
	}
    
	public static double obtenerNumero(Scanner scanner){
		double numero;
		while(true){
			System.out.println("Dime un numero: ");
			String dato = scanner.nextDouble();
			try{
					numero = Double.parseDouble(dato);
					break;
			}
			catch(NumberFormatException e){
					System.out.println("No es un Número, Intenta de Nuevo...");
			}
		}
		return numero;
	}
    
}
