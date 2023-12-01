package transporte;

public class Aviao extends MeioTransporte{

	//atributo
		private int NumeroMotores;
		
		//construtor
		public Aviao(String modelo, int NumeroMotores) {
			super(modelo);
			this.NumeroMotores = NumeroMotores;
		}
		
		//Get e Set
		public int getNumeroMotores() {
			return NumeroMotores;
		}
		
		public void setNumeroMotores(int NumeroMotores) {
			this.NumeroMotores = NumeroMotores;
		}
}
