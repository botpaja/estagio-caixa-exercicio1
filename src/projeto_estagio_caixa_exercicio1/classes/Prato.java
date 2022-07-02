package projeto_estagio_caixa_exercicio1.classes;

public class Prato {
	
	private int numeroPrato;
	private String nomePrato;
	
	public Prato(int numeroPrato, String nomePrato) {
		this.numeroPrato = numeroPrato;
		this.nomePrato = nomePrato;
	}
	
	public int getNumeroPrato() {
		return numeroPrato;
	}
	public void setNumeroPrato(int numeroPrato) {
		this.numeroPrato = numeroPrato;
	}
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	
	
}
