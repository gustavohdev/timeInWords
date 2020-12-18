package hello;

import java.util.Scanner;

public class TimeInWords {
		public static void main(String[] args) {

		/*
		
			LocalTime currentTime = new LocalTime();
			System.out.println("The current local time is: " + currentTime);
			Greeter greeter = new Greeter();
			System.out.println(greeter.sayHello());
			//LocalTime currentTime = new LocalTime();
			//System.out.println("The current local time is: " + currentTime);
		
		*/
		
		// NUMBER EXCEPTION
		//try {
			//new ParsingHour.intParsingMethod();
		//} catch (NumberFormatException e) {
			//System.out.println("");
		//}

		// create a scanner
		Scanner scanner = new Scanner(System.in);

		//  prompt for the time
		System.out.print("Enter the time ( HH:MM ) :  ");

		// get their input as a String
		String timeWrited = scanner.next();

		try{

			//int hourInt = Integer.parseInt(timeWrited.substring(0,2));
			//int miutesInt = Integer.parseInt(timeWrited.substring(3,5));

			int hourInt = ParsingHour.intParsingMethod(timeWrited.substring(0,2));
			int minutesInt = ParsingHour.intParsingMethod(timeWrited.substring(3,5));
			
			ConvertDate.printWords(hourInt, minutesInt, timeWrited.toString());

		}catch (Exception e){
			//show trace
			e.printStackTrace();

		}finally{
			// close scanner
			scanner.close();
		}

	}
}
