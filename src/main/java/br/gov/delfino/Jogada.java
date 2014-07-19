package br.gov.delfino;

public class Jogada {

	private Integer coluna;
	
	private Integer linha;

	public Jogada(Integer coluna, Integer linha) {
		super();
		this.coluna = coluna;
		this.linha = linha;
	}

	public Integer getColuna() {
		return coluna;
	}

	public Integer getLinha() {
		return linha;
	}
	
}
