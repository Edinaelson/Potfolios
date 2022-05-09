import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hotel");
		menu();
		int diaSemana = calendario();
		
		if(diaSemana > 1 && diaSemana < 7) {
			System.out.println("durante a semana");
		}else {
			System.out.println("Final de semana");
		}
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
	}
	
	public static int calendario() {
		Calendar calendar = Calendar.getInstance();
		
		 int dia = calendar.get(calendar.DAY_OF_MONTH);
		 int diaSemana = calendar.get(calendar.DAY_OF_WEEK);
		 int ano = calendar.get(Calendar.YEAR);
		 int mes = calendar.get(Calendar.MONTH);//mes 4 igual a maio
		 
		 System.out.println("Dia da semana: " + diaSemana);
		 System.out.println("Dia do mes: " + dia);
		 System.out.println("Ano: " + ano);
		 System.out.println("Mes: " + mes);
		 String formato = "Dia: " +dia+" mes: "+mes+" Ano: "+ano;
		 System.out.println("Data: " + formato);
		 
		 return diaSemana;
		 
	}
	
	
}
