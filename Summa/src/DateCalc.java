import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalc {

	public static void main(String[] args) throws ParseException {
		ArrayList<Date> holidayList = new ArrayList<Date>();
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("26/07/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("24/09/2016"));
		Integer intr = 8;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date date = new Date();
		System.out.println(dateFormat.format(date));
		Boolean itr = true;
		GregorianCalendar finalDate = new GregorianCalendar(); ;
		do{
			finalDate.setTime(date);
			finalDate.add(Calendar.DATE, intr);
			Integer newIntr = 0 ;
			System.out.println("Temp Calc Time"+finalDate.getTime());
			for(Date holiday : holidayList){
				if(!(holiday.before(date) || holiday.after(finalDate.getTime()))){
					newIntr++;
				}
			}
			itr = newIntr == 0 ? false : true;
			if(newIntr != 0){
				date = finalDate.getTime();
				intr = newIntr;
			}
		}while(itr);
		System.out.println("Final date is "+finalDate.getTime());
	}

}
