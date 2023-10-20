package dados;

import java.util.HashMap;
import java.util.Map;

public class ex02 {
	public static void main(String[] args) {
		//HashMap exemplo
		HashMap<Double, String> tabelaPreco = new HashMap();
		
		tabelaPreco.put(13.99, "maça");
		tabelaPreco.put(9.99, "maracuja");
		tabelaPreco.put(8.99, "limao");
		
		
		for(Map.Entry<Double, String>entry : tabelaPreco.entrySet()) {
			
			Double chave = entry.getKey();
			String valor = entry.getValue();
			
			System.out.println("Chave: " + chave + "\nValor:" + valor + "\n");
		}
	}

}

