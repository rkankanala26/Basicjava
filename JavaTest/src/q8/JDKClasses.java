package q8;
//Use two JDK classes
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class JDKClasses {

	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println(date.getTime());
		System.out.println("Today's Date: "+ date);
		System.out.println(" ");
		
		System.out.println("Time Zone in short form: "+TimeZone.SHORT);
		System.out.println(" ");

		System.out.println("Time Zone in long form: "+TimeZone.LONG);
		System.out.println(" ");
		
		System.out.println("Default Time Zone: "+TimeZone.getDefault());
		System.out.println(" ");
		
		System.out.println("IST Time Zone: "+TimeZone.getTimeZone("IST"));
		System.out.println(" ");
		
		TimeZone timeZone;
		   String[] id = TimeZone.getAvailableIDs();        
		   System.out.println("In TimeZone class available Ids are: ");  
		   for (int i=0; i<id.length; i++){  
		   System.out.println(id[i]);  
		   } 
				  
			System.out.println("UTC Time Zone: "+SimpleTimeZone.UTC_TIME);
			System.out.println(" ");
			
		TimeZone timezone = SimpleTimeZone.getDefault();
		
		System.out.println("My time zone is:" + timezone);
	}


}
