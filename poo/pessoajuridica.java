
public class pessoajuridica extends conta {

	protected String Cnpj;
	protected String razaoSocial;
	
	public pessoajuridica(String Cnpj, String razãoSocial) {
		this.Cnpj = Cnpj;
		this.razaoSocial = razãoSocial;
	}
	
	public String getCnpj() {
		return Cnpj;
	}
	
	public void setCnpj(String Cnpj) {
		this.Cnpj = Cnpj ;
	}
	
	public String getrazaoSocial() {
		return razaoSocial;
	}
	
	public void setrazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String toString() {
		return super.toString()+
		"\nCNPJ: "+this.Cnpj+
		"\nRazão Social: "this.razaoSocial+
		"\n-----------------\n";
	}
	
}
