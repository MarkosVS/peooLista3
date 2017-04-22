import java.util.ArrayList;

public class Personagem{
	//atributos
	private int peso;
	private int pesoAdicional;
	private int ataque;
	private int defesa;
	private int hp;
	private ArrayList<Item> itens;

	//getters
	public int getPeso(){
		return this.peso;
	}

	public int getPesoAdicional(){
		return this.pesoAdicional;
	}

	public int getAtaque(){
		return this.ataque;
	}

	public int getDefesa(){
		return this.defesa;
	}

	public int getHp(){
		return this.hp;
	}

	public ArrayList<Item> getItens(){
		return this.itens;
	}
}