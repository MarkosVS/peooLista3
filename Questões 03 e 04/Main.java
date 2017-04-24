public class Main{
	public static void main(String[] args){
		Personagem p = new Personagem(50, 73, 36, 139);
		Espada exPadao = new Espada(25, 37);
		Escudo exCudo = new Escudo(32, 45);
		Espada espPapel = new Espada(0, 0);
		Escudo escPapel = new Escudo(0, 0);
		exPadao.usar(p);
		exCudo.usar(p);

		/*
		espPapel.usar(p);
		escPapel.usar(p);
		*/

		//testes
		System.out.println("hp de p = " + p.getHp());
		System.out.println("ataque de p = " + p.getAtaque());
		System.out.println("defesa de p = " + p.getDefesa());
		System.out.println("peso de p = " + p.getPeso());
		System.out.println("peso adicional de p = " + p.getPesoAdicional());
		System.out.println("peso total de p = " + p.peso());
	}
}