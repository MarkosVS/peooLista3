import java.util.Vector;

public class Main {

	public static void main(String[] args){
		Funcionario f1 = new AnalistaDeSistemas("Joao", "123", 4500);
		Funcionario f2 = new ProgramadorTerceirizado("Erika", "456", 2500);
		Vector<Funcionario> v = new Vector<Funcionario>();
		v.add(f1);
		v.add(f2);
		for(Funcionario f : v)
			f.descontar();
	}
}