import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateCalc {

	public static void main(String[] args) throws ParseException {
		List<Date> holidayList = new ArrayList<Date>();
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("26/07/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2016"));
		holidayList.add( new SimpleDateFormat("dd/MM/yyyy").parse("24/09/2016"));
		
		//Try to populate Weekend List
		List<Date> weekendListList = weekendList();
				
		//Combine the holiday and weekend list together
		List<Date> nonBusinessList = new ArrayList<Date>();
		nonBusinessList.addAll(weekendListList);
		nonBusinessList.addAll(holidayList);
		
		//For now Hard Coding the interval for installation to 8 business dates
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
			for(Date holiday : nonBusinessList){
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
		System.out.println("The customer facility should be ready by: "+finalDate.getTime());
	}
	private static List<Date> weekendList() {
		List<Date> arrList = new ArrayList<Date>();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i <= 51; i++)  {
		    try   {
		        cal.add(Calendar.WEEK_OF_YEAR, 0);
		    	//Saturday
		        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		        String formatted = format1.format(cal.getTime());
		        date = format1.parse(formatted);
		        //Sunday
		        arrList.add(date);
		        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		        formatted = format1.format(cal.getTime());
		        date = format1.parse(formatted);
		        arrList.add(date);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		System.out.println("Weekend List is " + arrList.toString());
		return arrList;
	}

}
