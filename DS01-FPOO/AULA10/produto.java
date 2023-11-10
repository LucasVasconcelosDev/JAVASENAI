package obj;

public class produto {

    // atributos ou propriedades da classe
    private String marca;
    private String modelo;
    private double preco;

    // contrutor
    public produto(String marca, String modelo, double preco){
        this.marca  = marca;
        this.modelo = modelo;
        this.preco  = preco;
    }

    // métodos getters and setters
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}