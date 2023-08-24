package ProjetoTiposOperadores;
import java.util.Scanner;
public class ClassConversaoGraus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//ENTRADA
		System.out.print("DIGITE UMA TEMPERATURA EM GRAUS CELSIUS:");
		float tempC = scn.nextFloat();
		//PROCESSAMENTO
		float tempF = tempC * 9 / 5 + 32;
		//SAIDA
		System.out.print("EM FAHRENHEIT SÃO: ");
		System.out.print(tempF);

	}

}
