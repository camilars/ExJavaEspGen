class Produto{
	public String fabricante;
	public String modelo;
	public String descricao;
	public flaot preco;
}

class Televisao{

}

class Refrigerador{

}

class ArCondicionado{

}

class Roupeiro{

}

class Informatica extends Produto{
	public String memoria;
	public String capacidadeHD;
	public String processador;
	public String placaDeVideo;
}

class Computador extends Informatica{

}

class Notebook extends Informatica{
	public flaot polegadas;
	public String duracaoDaBateria;
}