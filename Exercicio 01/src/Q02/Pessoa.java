package Q02;

public class Pessoa {
	private String nome, sexo;
	private int idade;
	private double altura, peso;

	public Pessoa(String nome, String sexo, int idade, double altura, double peso) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public double imc() {
		return this.peso / (this.altura * this.altura);
	}

	private String categoria() {
		double imc = this.imc();
		if (imc <= 18.5)
			return "Abaixo do peso normal";
		else if (imc <= 25)
			return "Peso normal";
		else if (imc <= 30)
			return "Acima do peso normal";
		return "Obesidade";
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCategoria: " + this.categoria();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
