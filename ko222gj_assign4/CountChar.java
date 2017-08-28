package ko222gj_assign4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CountChar {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		int small = 0;
		int big = 0;
		int whitespace = 0;
		int other = 0;
		
		StringBuilder contents = new StringBuilder();
		BufferedReader input = new BufferedReader(new FileReader("C:/Users/khalid/workspace/1DV506/src/ko222gj_assign4/second_file"));
		String line = null;
		try {
			while ((line = input.readLine()) != null) {
				contents.append(line);
			}
		//System.out.println(contents);
		}
		catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			input.close();
		}
		String text = contents.toString();
		
		//System.out.println(text);

		int sblen = text.length();
		for (int i = 0; i < sblen; i++) {
			//System.out.println(sb.charAt(i));
			char x = text.charAt(i);
			//System.out.println(x);
			if (Character.isLetter(x)) {
				if (Character.isUpperCase(x)) {
					big++;
				}
				else {
					small++;
				}
					
			}
			else if (Character.isSpaceChar(x)) {
				whitespace = whitespace + 1;
			}
			else {
				other++;
			}
		}
		System.out.println("Number of lower case letters: "+ small);
		System.out.println("Number of upper case letters: " + big);
		System.out.println("Number of whitespace: " + whitespace);
		System.out.println("Number of other: " + other);
	}

}
