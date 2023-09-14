package ExtraJava;
import java.util.Scanner;
public class Class_CPF2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		boolean validador = true;
	
		do {
			int digito1 = 0, digito2 = 0;
			String cpf = " ";
			Integer [] cpfArray = new Integer[11];
	
			System.out.println("Digite seu CPF, apenas numeros: ");
			cpf = scan.next();		
	
			for(int i = 0, teste1 = 10; i <= 8; i++, teste1--){
				int cpf3 = Integer.parseInt(String.valueOf(cpf.charAt(i)));
				digito1 += (cpf3 * teste1);
			}
			for(int i = 0, teste2 = 11; i <= 9; i++, teste2--){
				int cpf3 = Integer.parseInt(String.valueOf(cpf.charAt(i)));
				digito2 += (cpf3 * teste2);
			}
			for(int i = 0; i < cpf.length();i++) {
				int cpf3 = Integer.parseInt(String.valueOf(cpf.charAt(i)));
				cpfArray[i] = cpf3;
			}
			digito1 = (digito1 % 11);
			digito2 = (digito2 % 11);
	
			if (digito1<2) {
				digito1 = 0;
			}else {
				digito1 = 11 - digito1;
			}
			if (digito2<2) {
				digito2 = 0;
			}else {
				digito2 = 11 - digito2;
			}
			if ((digito1 == cpfArray[9]) && (digito2 == cpfArray[10])) {
				System.out.println("\nCpf valido!");			
			}else {
				System.out.println("\nCPF invalido!");
			}
			System.out.println("Deseja fazer uma nova consulta?\\n \\\"Y\\\" ou \\\"N\\\": ");
			String decision = scan.next();
			if (decision.equalsIgnoreCase("y")) {
				continue;
			}else if(decision.equalsIgnoreCase("n") || (cpf.length() > 11)) {
				validador = false;break;
			}
		}while(validador==true);
	}
}