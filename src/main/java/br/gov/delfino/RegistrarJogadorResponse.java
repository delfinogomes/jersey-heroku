package br.gov.delfino;

public class RegistrarJogadorResponse {

	private String nomeJogador;
	
	private boolean statusRegistro;

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public boolean isStatusRegistro() {
		return statusRegistro;
	}

	public void setStatusRegistro(boolean statusRegistro) {
		this.statusRegistro = statusRegistro;
	}
	
}
