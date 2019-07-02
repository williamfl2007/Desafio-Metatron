package main;

public class Conversao {

	private String converteKey(Character key,Character keyAnterior){
		String convertido ="";
		switch (key) {
		case 'A':convertido = "2";
		break;
		case 'B':convertido = "22";
		break;
		case 'C':convertido = "222";
		break;
		case 'D':convertido = "3";
		break;
		case 'E':convertido = "33";
		break;
		case 'F':convertido = "333";
		break;
		case 'G':convertido = "4";
		break;
		case 'H':convertido = "44";
		break;
		case 'I':convertido = "444";
		break;
		case 'J':convertido = "5";
		break;
		case 'K':convertido = "55";
		break;
		case 'L':convertido = "555";
		break;
		case 'M':convertido = "6";
		break;
		case 'N':convertido = "66";
		break;
		case 'O':convertido = "666";
		break;
		case 'P':convertido = "7";
		break;
		case 'Q':convertido = "77";		
		break;
		case 'R':convertido = "777";		
		break;
		case 'S':convertido = "7777";		
		break;
		case 'T':convertido = "8";		
		break;
		case 'U':convertido = "88";		
		break;
		case 'V':convertido = "888";		
		break;
		case 'W':convertido = "9";		
		break;
		case 'X':convertido = "99";		
		break;
		case 'Y':convertido = "999";		
		break;
		case 'Z':convertido = "9999";		
		break;
		}
		if(keyAnterior !=null && (!keyAnterior.equals("0".charAt(0))) && keyAnterior.equals(convertido.charAt(0))){
			return "_"+convertido;
		}
		return convertido;
	}

	public String converteFrase(String frase){

		char[] arrayKey= frase.toUpperCase().toCharArray();			

		String conversao ="";
		Character keyAnterior = null;
		for (int i = 0; i <  arrayKey.length ; i++) {
			Character key = arrayKey[i];			
			if(key.equals(" ".charAt(0)))
				conversao += "0";
			else{
				conversao +=  converteKey(key,keyAnterior);				
			}
			keyAnterior = conversao.charAt(conversao.length()-1);			
		}
		return conversao;
	}
}
