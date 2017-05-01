public abstract class Funcionario {
	//atributos
	private String nome;
	private String cpf;
	private double salario;

	//metodos
	public String getNome(){
		return this.nome;
	}

	public String getCpf(){
		return this.cpf;
	}

	public double getSalario(){
		return this.salario;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public abstract void descontar();
}