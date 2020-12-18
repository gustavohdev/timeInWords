package hello;

import hello.ConvertDate;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;


public class TimeInWordsTest {
	
	//private Greeter greeter = new Greeter();

	@Test
	public void firstCase() {
		assertThat(printInWords(05,00,"05:00"), containsString("clock"));
	}

}


