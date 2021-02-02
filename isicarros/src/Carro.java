
public class Carro {

	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	void exibirAnuncio() {
		System.out.println("---Anuncio do isiCarros");
		System.out.println("Carro:"+marca+" " +modelo+"/"+ano);
		System.out.println("Cor:" +cor);
		System.out.println("Preco: R$"+preco);
		
	}
}