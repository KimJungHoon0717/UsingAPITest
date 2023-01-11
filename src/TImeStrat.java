import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TImeStrat {

	public static void main(String[] args) {
		TimeZone tz=TimeZone.getTimeZone("Europe/London");
		GregorianCalendar g=new GregorianCalendar(tz);
		Calendar c=Calendar.getInstance();
		
		System.out.println("London: "+g.get(Calendar.HOUR_OF_DAY));
		System.out.println("Seoul: "+c.get(Calendar.HOUR_OF_DAY));
		/*
		String TimezoneID[]=TimeZone.getAvailableIDs();
		for(String tId : TimezoneID) {
			System.out.println(tId);
		}
		*/
		long start=System.currentTimeMillis();
		for(int i=0; i<1000;i++) {
			System.out.println("ȫ�浿");
			long end=System.currentTimeMillis();
		}
	}

}
