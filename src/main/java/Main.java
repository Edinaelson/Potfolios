import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hotel");
		menu();
	}
	
	public static void menu() {
		
		Scanner input = new Scanner(System.in);
		String tipoCliente;
		
		System.out.println("|--------------Menu----------------------|");
		System.out.println("|Digite-1: Regular-||-Digite-2-Fidelidade|");
		int tipo = input.nextInt();
		if(tipo == 1) {
			tipoCliente = "Regular";
		}else {
			tipoCliente = "Reward";
		}
		
	}

}
