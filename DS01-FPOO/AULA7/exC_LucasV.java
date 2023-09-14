package ExtraJava;

public class Class_soma {

	public static void main(String[] args) {
		int soma=0;
		System.out.println("Soma dos numeros de 1 a 100:");
		
		for(int i=0; i<=100; i++) {
			System.out.print(soma + " + " + i + " = ");
			soma = soma + i;
			System.out.println(soma);
		}

	}

}
