package transporte;
import java.util.*;
public class TesteMeioTransporte {

	public static void main(String[] args) {
		//vamos criar os  ArrayList - Carro e Aviao
		ArrayList<Carro> carros = new ArrayList<>();
		ArrayList<Aviao> avioes = new ArrayList<>();
		
		System.out.println("-=LISTA CARROS=-");
		//Vamos criar e adcionar objetos ao ArrayList carros
		for(int i=0; i<2; i++) {
			Carro carro = criarCarro();
			carros.add(carro);
		}
		
		//vamos exibir as informaçoes dos carros cadastrados
		System.out.println("-=CARROS CADASTRADOS=-");
		for(Carro carro: carros) {
			System.out.println("modelo:  " + carro.getModelo());
			System.out.println("Numero de portas:  " + carro.getNumeroPortas());
			System.out.println("--------------------");
		}
		
		System.out.println("-=LISTA AVIÕES=-");
		//Vamos criar e adcionar objetos ao ArrayList carros
		for(int i=0; i<2; i++) {
			Aviao aviao = criarAviao();
			avioes.add(aviao);
		}
		
		//vamos exibir as informaçoes dos carros cadastrados
		System.out.println("-=AVIÕES CADASTRADOS=-");
		for(Aviao aviao: avioes) {
			System.out.println("modelo:  " + aviao.getModelo());
			System.out.println("Numero de motores:  " + aviao.getNumeroMotores());
			System.out.println("--------------------");
		}
	}
	
	private static Carro criarCarro() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o modelo do Carro: ");
		String modelo = scan.nextLine();
		
		System.out.print("Digite o numero de portas: ");
		int numeroPortas = scan.nextInt();
		
		//Carro carro = new Carro(modelo, numeroPortas);
		return new Carro(modelo, numeroPortas);
	}
	
	private static Aviao criarAviao() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o modelo do avião: ");
		String modelo = scan.nextLine();
		
		System.out.print("Digite o numero de motores: ");
		int numeroMotores = scan.nextInt();
		
		//Carro carro = new Carro(modelo, numeroPortas);
		return new Aviao(modelo, numeroMotores);

	}
}