
public class Loja {
	public static void main(String[] args) {
		
		Carro c1;
		Carro c2;
		
		c1 = new Carro();
		c2 = new Carro();
				
		c1.cor = "branco com detalhes;";
		c1.marca = "chev";
		c1.modelo = "corsa";
		c1.ano = 1997;
		c1.preco = 6999.00;
		
		c2.marca = "porsche";
		c2.modelo = "cay";
		c2.cor = "preto";
		c2.ano = 2019;
		c2.preco = 839999.00;
		
		
		c1.exibirAnuncio();
		c2.exibirAnuncio();
		
		/*
		System.out.println("---Anuncio do isiCarros");
		System.out.println(" Carro:"+c1.marca+" "+c1.modelo+"/"+ c1.ano);
		System.out.println("---Anuncio do isiCarros");
		System.out.println("---Anuncio do isiCarros");	
		*/
		
	}
}
