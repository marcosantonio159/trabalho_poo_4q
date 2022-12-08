
public class pessoafisica extends conta {

	protected String cpf;
	protected String sobrenome;
	
	public pessoafisica(String cpf, String sobrenome) {
		this.cpf = cpf;
		this.sobrenome = sobrenome;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getsobrenome() {
		return sobrenome;
	}
	
	public void setsobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String toString() {
		return super.toString()+
		"\nCpf: "+this.cpf+
		"\nSobrenome: "+this.sobrenome+
		"\n-----------------\n";
	}
	
}
