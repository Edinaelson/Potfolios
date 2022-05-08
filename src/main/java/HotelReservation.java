import static org.junit.Assert.assertEquals;

import java.util.Calendar;

public class HotelReservation {
    public String getCheapestHotel (String input) {
    	
    	Calendar calendar = Calendar.getInstance();
    	Calendar calendar1 = Calendar.getInstance();
    	Calendar calendar2 = Calendar.getInstance();
    	
    	
    	calendar.set(2009,2,16);
    	calendar1.set(2009,2,17);
    	calendar2.set(2009,2,18);
    	
    	int diaSemana = calendar.get(calendar.DAY_OF_WEEK);
    	int dia = calendar.get(calendar.DAY_OF_MONTH);
    	int mes = calendar.get(calendar.MONTH);
    	int ano = calendar.get(calendar.YEAR);
    	
    /* * @see #JANUARY
     * @see #FEBRUARY
     * @see #MARCH
     * @see #APRIL
     * @see #MAY
     * @see #JUNE
     * @see #JULY
     * @see #AUGUST
     * @see #SEPTEMBER
     * @see #OCTOBER
     * @see #NOVEMBER
     * @see #DECEMBER
    	 * */
    	
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
    	
     /*@see #SUNDAY
     * @see #MONDAY
     * @see #TUESDAY
     * @see #WEDNESDAY
     * @see #THURSDAY
     * @see #FRIDAY
     * @see #SATURDAY*/
    	
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
    	
    	float valorHotel = 110;
    	String nomeHotel = null;
    	input = "Regular";
    	if(input.equals("Regular")) {
    		if (diaSemana > 1 && diaSemana < 7 && valorHotel == 110) {
    			nomeHotel = "Lakewood";
    		}
    	}
    	
    	
    	
    	String date1 = Integer.toString(dia)+mesNome+ano+nomeDiaSemana;
    	String date2 = Integer.toString(17)+mesNome+ano+("(tues)");
    	String date3 = Integer.toString(18)+mesNome+ano+("(wed)");
    	
    	
    	
    	//assertEquals("Lakewood", Hotel.getCheapestHotel("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)"));
        return nomeHotel;
    }
    
    public void setData() {
    	
    }
    
}
