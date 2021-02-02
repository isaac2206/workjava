public class Bomba {
	private double    litros;
	private String combustivel;
	private double valorLitro;
	private double total;
	
	public Bomba(double litros, String combustivel, double valorLitro, double total) {
		this.litros = 1;
		this.combustivel = "gas";
		this.valorLitro = 3.99;
		this.total       = 3.99;
	}
	
	public double litros() {
		return litros;
	}

	public void litros(int litros) {
		this.litros = litros;
	}

	public String cobustivel() {
		return combustivel;
	}

	public void combustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double valorLitro() {
		return valorLitro;
	}

	public void valorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}

	public double total() {
		return total;
	}

	public void total(double total) {
		this.total = total;
	}

	
	public String exibirRecibo() {
		return total+"-"+combustivel+" : " +valorLitro+" "+litros; 
	}
	
	public void porLitro(double valor) {
		total = valor*valorLitro;
	}
	public void porValor(double valor) {
		total = valor;
		litros = valor/valorLitro;
	}
	
	

}