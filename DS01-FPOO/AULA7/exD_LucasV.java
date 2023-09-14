package ExtraJava;

public class Class_somapar {

	public static void main(String[] args) {
		int soma=0;
		System.out.println("Soma dos numeros pares de 1 a 500:");
		
		for(int i=0; i<=500; i++) {
			if(i%2==0) {
				System.out.print(soma + " + " + i + " = ");
				soma = soma + i;
				System.out.println(soma);
			}
		}
	}
}
