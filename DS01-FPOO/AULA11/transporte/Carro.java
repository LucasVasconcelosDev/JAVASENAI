package transporte;

public class Carro extends MeioTransporte {

	//atributo
	private int NumeroPortas;
	
	//construtor
	public Carro(String modelo, int NumeroPortas) {
		super(modelo);
		this.NumeroPortas = NumeroPortas;
	}
	
	//Get e Set
	public int getNumeroPortas() {
		return NumeroPortas;
	}
	
	public void setNumeroPortas(int NumeroPortas) {
		this.NumeroPortas = NumeroPortas;
	}
}
