public class Escudo extends Item{
	//atributos
	private int def;

	//construtor
	public Escudo(int peso, int def){
		this.setPeso(peso);
		this.def = def;
	}
	
	//getter e setter
	public int getDef(){
		return this.def;
	}

	public void setDef(int def){
		this.def = def;
	}

	//override
	@Override
	public void usar(Personagem p){
		if(this.getPeso() + p.getPesoAdicional() >= p.getPeso()){
			for(Item i : p.getItens())
				if(i instanceof Escudo){
					Escudo esc = (Escudo) i;
					p.setPesoAdicional(p.getPesoAdicional() - i.getPeso());
					p.setDefesa(p.getDefesa() - esc.getDef());
					p.getItens().remove(i);
				}

			//isso aqui é fora do for tá
			p.getItens().add(this);
			p.setPesoAdicional(p.getPesoAdicional() + this.getPeso());
			p.setDefesa(this.def + p.getDefesa());
		}
	}
}