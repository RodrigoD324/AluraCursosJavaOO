
// não podemos instanciar dessa classe, pois não é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; //Protected ---> As classes filhas irão enxergar essa variável encapsulada. 
							  //               (variável pública para as classes filhas da classe mãe)
	
	// método sem corpo, não há implementação!
	public abstract double getBonificacao();
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}