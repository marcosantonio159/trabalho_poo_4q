
public class pessoa extends conta {

	protected String nome;
	
	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String name() {
		return nome;
	}
	
	@Override
	public String toString() {
		return name();
	}
	
}
