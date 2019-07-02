package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Conversao; 

public class ConversaoTest {
	private Conversao conversao;
	
	@Test
	public void converteFraseDigitadaEmNumerotest() {
		conversao = new Conversao();
		String esperado = "77773367_7773302_222337777_777766606660366656667889999_9999555337777";
	    String convertido = conversao.converteFrase("SEMPRE ACESSO O DOJOPUZZLES");
	    assertEquals(esperado, convertido);
	}

}
