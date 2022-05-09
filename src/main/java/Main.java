import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hotel");
		menu();
	}
	
	public static void menu() {
		
		Scanner input = new Scanner(System.in);
		String tipoCliente;
		Calendar  calendar = Calendar.getInstance();
		
		System.out.println("|--------------Menu----------------------|");
		System.out.println("|Digite-1: Regular-||-Digite-2-Fidelidade|");
		int tipo = input.nextInt();
		if(tipo == 1) {
			tipoCliente = "Regular";
		}else {
			tipoCliente = "Reward";
		}
		System.out.println("|Informe dia:----------------------------|");
		int dia = input.nextInt();
		System.out.println("|Informe mes:----------------------------|");
		int mes = input.nextInt();
		System.out.println("|Informe ano:----------------------------|");
		int ano = input.nextInt();
		calendar.set(ano,mes,dia);
		//System.out.println("Dia: " + calendar.get(calendar.DAY_OF_WEEK));
		int diaSemana = calendar.get(calendar.DAY_OF_WEEK);
		int diaMes = calendar.get(calendar.DAY_OF_MONTH);
		System.out.println("DIa do mes: " + diaMes);
		System.out.println("dia da semana: " + diaSemana);
		int mesano = calendar.get(calendar.MONTH);
		System.out.println("mes: " + mesano);
		
		
		
	}
	
}
