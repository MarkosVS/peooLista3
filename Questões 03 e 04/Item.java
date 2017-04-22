public abstract class Item{
	//atributos
	private int peso;

	//getter e setter
	public int getPeso(){
		return this.peso;
	}

	public void setPeso(int peso){
		this.peso = peso;
	}
	//metodos abstratos
	public abstract void usar(Personagem p);
}