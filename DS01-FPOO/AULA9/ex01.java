package dados;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		//HashMap exemplo
		HashMap<String, Integer> mapa = new HashMap();
		
		mapa.put("chave1", 1);
		mapa.put("chave2", 2);
		mapa.put("chave3", 3);
		mapa.put("chave4", 4);
		
		int valor = mapa.get("chave2");
		System.out.println("o valor de chave2 é: " + valor);
	}

}
