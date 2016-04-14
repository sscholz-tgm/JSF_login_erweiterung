import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File input = new File("src/input");
		int c;
		try {
			InputStream in= new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(input)));
			while((c=in.read())>=0){
				System.out.print((char)c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
