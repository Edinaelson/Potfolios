import java.util.Calendar;

public class HotelReservation {
    public String getCheapestHotel (String input) {
    	
    	Calendar calendar = Calendar.getInstance();
    	
    	calendar.set(2009,2,16);
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
    	
    	String mesNome;
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
    	
    	String nomeDiaSemana;
    	switch(diaSemana) {
    	case 1:
    		nomeDiaSemana = "Sun";
    		break;
    	case 2:
    		nomeDiaSemana = "Mon";
    		break;
    	case 3:
    		nomeDiaSemana = "Tues";
    		break;
    	case 4: 
    		nomeDiaSemana = "Wedn";
    		break;
    	case 5:
    		nomeDiaSemana = "Thur";
    		break;
    	case 6:
    		nomeDiaSemana = "Fri";
    		break;
    	case 7: 
    		nomeDiaSemana = "Sat";
    		break;
    	}
    	
    	float valorHotel = 110;
    	String nomeHotel;
    	
    	if(input.equals("Regular")) {
    		if (diaSemana > 1 && diaSemana < 7 && valorHotel == 110) {
    			nomeHotel = "Lakewood";
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        return "Cheapest hotel name";
    }
    
    public void lakewood() {
    	
    }
    
}
