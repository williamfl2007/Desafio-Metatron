import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DojoPuzzles {

	private static BufferedReader s;

	public static void main(String[] args) {
		Conversao conversao = new Conversao();
		
		s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite a palavra a ser convertida");	
		String convertido = null;
		try {
			convertido = conversao.converteFrase(s.readLine().trim());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("A Palavra convertida é:"+convertido);
	}

	
}
