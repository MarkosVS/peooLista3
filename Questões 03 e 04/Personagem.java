import java.util.ArrayList;

public class Personagem{
	//atributos
	private int peso;
	private int pesoAdicional;
	private int ataque;
	private int defesa;
	private int hp;
	private ArrayList<Item> itens;

	//construtor
	public Personagem(){
		this.itens = new ArrayList<>();
	}
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

	//setters
	public void setPeso(int peso){
		this.peso = peso;
	}

	public void setPesoAdicional(int peso){
		this.pesoAdicional = peso;
	}

	public void setAtaque(int atk){
		this.ataque = atk;
	}

	public void setDefesa(int def){
		this.defesa = def;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public void setItens(ArrayList<Item> itens){
		this.itens = itens;
	}
}