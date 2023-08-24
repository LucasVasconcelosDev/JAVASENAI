package ProjetoTiposOperadores;
import java.util.Scanner;
public class ClassConversaoGrausFtoC {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//ENTRADA
		System.out.print("DIGITE UMA TEMPERATURA EM GRAUS FAHRENHEIT:");
		float tempF = scn.nextFloat();
		//PROCESSAMENTO
		float tempC =  ((tempF - 32) * 5) / 9;
		//SAIDA
		System.out.print("EM CELSIUS SÃO: ");
		System.out.print(tempC);

	}

}
