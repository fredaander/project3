import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


public class CountFrequencies {

	public static void countLetters(String file){

		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file),
							Charset.forName("UTF-8")));
			int c;

			while((c = reader.read()) != -1) {
				char character = (char) c;
				// Do something with your character
				System.out.println(character + " " + c); 
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
