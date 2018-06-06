abstract class Produto{
	public String fabricante;
	public String modelo;
	public String descricao;
	public double preco;
}

abstract class Eletronico extends Produto{
	public int voltagem;
	public int anoLancamento;
	public int consumoEnergia;

}
class Televisao extends Eletronico{
	protected int polegadas;

}

class Refrigerador extends Eletronico{
	protected int capacidade;
	protected boolean duplex;
	protected boolean frostFree;
}

class ArCondicionado extends Eletronico{
	protected float potencia;
	protected boolean split;
}

class Roupeiro extends Produto{
	protected float altura;
	protected float largura;
	protected float profundidade;
	protected String[] materiais;
}

abstract class Computador extends Produto{
	public int memoria;
	public int capacidadeHD;
	public String processador;
	public String placaDeVideo;
}

class Notebook extends Computador{
	protected int polegadas;
	protected int duracaoDaBateria;
}

class App{
	public static void main(String[] args) {
		Produto carrinho[] = new Produto[10];

	carrinho[0] = new ArCondicionado();
	carrinho[1] = new Notebook();
	carrinho[2] = new Roupeiro();
	carrinho[3] = new Televisao();

	for (int i = 0; i < carrinho.length; i++) {
		System.out.println("Produto" + i + ":" + carrinho)
	}

	}
}