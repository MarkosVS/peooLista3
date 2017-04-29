public class Espada extends Item{
	//atributos
	private int atk;

	//construtor
	public Espada(int peso, int atk){
		this.setPeso(peso);
		this.atk = atk;
	}
	
	//getter e setter
	public int getAtk(){
		return this.atk;
	}

	public void setAtk(int atk){
		this.atk = atk;
	}
	
	//override
	@Override
	public void usar(Personagem p){
		if(this.peso + p.getPesoAdicional() >= p.getPeso()){
			for(Item i : p.getItens())
				if(i instanceof Espada){
					Espada esp = (Espada) i;
					p.setPesoAdicional(p.getPesoAdicional() - i.getPeso());
					p.setAtaque(p.getAtaque() - esp.getAtk());
					p.getItens().remove(i);
				}

			//isso aqui é fora do for tá
			p.getItens().add(this);
			p.setPesoAdicional(p.getPesoAdicional() + this.getPeso());
			p.setAtaque(this.atk + p.getAtaque());
		}
	}
}