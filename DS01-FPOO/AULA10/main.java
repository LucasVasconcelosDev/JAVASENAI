package obj;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        // vamos criar nosso ArrayList do tipo Produto
        // https://www.w3schools.com/java/java_arraylist.asp
        ArrayList<produto> listaProdutos = new ArrayList<produto>();

        System.out.print("Digite o número de produtos: ");
        int qtde_Produtos = scn.nextInt();
        
        for(int i = 0; i < qtde_Produtos; i++){
            scn.nextLine();
            System.out.println("Digite os dados para o produto #" + (i + 1) + ": ");
            
            System.out.println("Digite a marca: ");
            String marca = scn.nextLine();
            
            System.out.println("Digite o modelo: ");
            String modelo = scn.nextLine();
            
            System.out.println("Digite o preço: ");
            double preco = scn.nextDouble();

            // vamos criar uma instância do objeto Produto
            produto produto = new produto(marca, modelo, preco);

            // vamos adicionar ao nosso ArrayList os dados do produto criado acima - linha 29
            listaProdutos.add(produto);

            scn.nextLine();
        } 
        
        System.out.println("\nLista de Produtos");
        for(produto produto : listaProdutos){
            System.out.println("Marca : " + produto.getMarca());
            System.out.println("Modelo: " + produto.getModelo());
            System.out.println("Preço : " + produto.getPreco());
            System.out.println();
        }
        scn.close();
    }    
}