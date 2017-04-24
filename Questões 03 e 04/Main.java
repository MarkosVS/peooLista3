public class Main{
	public static void main(String[] args){
		Personagem p = new Personagem(50, 73, 36, 139);
		Espada exPadao = new Espada(25, 37);
		exPadao.usar(p);

		//testes
		System.out.println("ataque de p = " + p.getAtaque());
		System.out.println("peso de p = " + p.getPeso());
		System.out.println("peso adicional de p = " + p.getPesoAdicional());
		System.out.println("peso total de p = " + p.peso());
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}