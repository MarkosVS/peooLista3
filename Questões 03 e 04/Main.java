import java.util.Random;

public class Main{
	public static void main(String[] args){
		Random jv = new Random();
		Personagem p = new Personagem(50, 73, 36, 139);
		Personagem p2 = new Personagem(54, 78, 33, 137);
		Espada exPadao = new Espada(19, 37);
		Escudo exCudo = new Escudo(22, 45);
		Espada exCalibur = new Espada(21, 35);
		Escudo exCudao = new Escudo(20, 47);

		exPadao.usar(p);
		exCudo.usar(p);
		exCalibur.usar(p2);
		exCudao.usar(p2);

		//testes
		System.out.println("hp de p = " + p.getHp());
		System.out.println("ataque de p = " + p.getAtaque());
		System.out.println("defesa de p = " + p.getDefesa());
		System.out.println("peso de p = " + p.getPeso());
		System.out.println("peso adicional de p = " + p.getPesoAdicional());
		System.out.println("peso total de p = " + p.peso());
		System.out.println("");

		//questao 04:
		int aleatorio;

		for(int i = 0; ; i++){
			aleatorio = jv.nextInt(4) + 1;
			if(i % 2 == 0){
				//p ataca
				p.atacar(p2);
				System.out.println("P ataca p2:");
				System.out.println("HP de p2 = " + p2.getHp());
				System.out.println("");
			}else{
				//p2 ataca
				p2.atacar(p);
				System.out.println("P2 ataca p:");
				System.out.println("HP de p = " + p.getHp());
				System.out.println("");
			}

			if(p.getHp() <= 0 || p2.getHp() <= 0)
				break;

			if(aleatorio == 5){
				exPadao.usar(p);
				exCudo.usar(p);
				exCalibur.usar(p2);
				exCudao.usar(p2);
			}else if(aleatorio == 1){
				exPadao.usar(p2);
				exCudo.usar(p2);
				exCalibur.usar(p);
				exCudao.usar(p);
			}
		}
	}
}