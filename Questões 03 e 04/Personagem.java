import java.util.ArrayList;

public class Personagem implements InterfacePersonagem {
	//atributos
	private int peso;
	private int pesoAdicional;
	private int ataque;
	private int defesa;
	private int hp;
	private ArrayList<Item> itens;
	private ArrayList<Item> bolsa;

	//construtores
	public Personagem(){
		this.pesoAdicional = 0;
		this.itens = new ArrayList<>();
		this.bolsa = new ArrayList<>();
	}

	public Personagem(int peso, int atk, int def, int hp){
		this.pesoAdicional = 0;
		this.peso = peso;
		this.ataque = atk;
		this.defesa = def;
		this.hp = hp;
		this.itens = new ArrayList<>();
		this.bolsa = new ArrayList<>();
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

	public ArrayList<Item> getBolsa(){
		return this.bolsa;
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

	//métodos
	public int peso(){
		return this.peso + this.pesoAdicional;
	}

	public void colocarItemNaBolsa(Item i){
		if(this.pesoAdicional + i.getPeso() <= this.peso){
			this.pesoAdicional += i.getPeso();
			this.bolsa.add(i);
		}
	}

	//metodos interface
	public void atacar(Personagem other){
		other.defender(this);
	}

	public void defender(Personagem other){
		if(other.ataque > this.defesa)
			this.hp -= (other.ataque - this.defesa);
	}
}