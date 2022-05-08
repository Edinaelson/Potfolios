import static org.junit.Assert.assertEquals;

import java.util.Calendar;

public class HotelReservation {
    public String getCheapestHotel (String input) {
    	
    	Calendar calendar = Calendar.getInstance();
    	
    	calendar.set(2009,2,16); //15 (domingo) primeiro dia da semana (1)
    	
    	int diaSemana = calendar.get(calendar.DAY_OF_WEEK);
    	int dia = calendar.get(calendar.DAY_OF_MONTH);
    	int mes = calendar.get(calendar.MONTH);
    	int ano = calendar.get(calendar.YEAR);
    	
    	String mesNome = null;
    	switch(mes) {
    	case 0:
    		mesNome = "Jan";
    		break;
    	case 1: 
    		mesNome = "Feb";
    		break;
    	case 2:
    		mesNome = "Mar";
    		break;
    	}
    	
    	String nomeDiaSemana = null;
    	switch(diaSemana) {
    	case 1:
    		nomeDiaSemana = "(sun)";
    		break;
    	case 2:
    		nomeDiaSemana = "(mon)";
    		break;
    	case 3:
    		nomeDiaSemana = "(tues)";
    		break;
    	case 4: 
    		nomeDiaSemana = "(wed)";
    		break;
    	case 5:
    		nomeDiaSemana = "(thur)";
    		break;
    	case 6:
    		nomeDiaSemana = "(fri)";
    		break;
    	case 7: 
    		nomeDiaSemana = "(sat)";
    		break;
    	}
    	
    	float valorHotel = 160;
    	String nomeHotel = null;
    	input = "Regular";
    	if(input.equals("Regular")) {
    		if (diaSemana > 1 && diaSemana < 7 && valorHotel == 110) {
    			nomeHotel = "Lakewood";
    		}
    		if(diaSemana == 1 || diaSemana == 7 && valorHotel == 80) {
    			nomeHotel = "Lakewood";
    		}
    		if (diaSemana > 1 && diaSemana < 7 && valorHotel == 160) {
    			nomeHotel = "Bridgewood";
    		}
    		if(diaSemana == 1 || diaSemana == 7 && valorHotel == 80) {
    			nomeHotel = "Lakewood";
    		}
    		
    		
    	}
    	
        return nomeHotel;
    }
    
}
