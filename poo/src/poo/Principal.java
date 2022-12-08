package poo;


public class Principal {
	public static void main(String[] args) {
		Pessoa jeova = new Pessoa("Jeová", "Tavares", 37);
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);
		
		Pessoa samuel = new Pessoa("Samuel", "Rodrigues", 37);
		ContaEspecial c2 =
			new ContaEspecial(samuel, 200);
		c2.debitar(500);
		
		pessoafisica c3 = new pessoafisica(
				new Pessoa("marcos", "antonio", "000.000.000-00"), 
				10000);
		
		pessoajuridica c4 = new pessoajuridica(
				new Pessoa("marcos", "antonio", "000000000-00", "cleito rasta"), 
				10000);
				
		System.out.println(c);

		System.out.println(c2);
		
		System.out.println(c3);
	}
}
