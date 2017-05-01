public class AnalistaDeSistemas extends Funcionario {

	public AnalistaDeSistemas(String nome, String cpf, double salario){
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}

	public void descontar(){
		setSalario(getSalario() - getSalario() * 0.1);
	}
}