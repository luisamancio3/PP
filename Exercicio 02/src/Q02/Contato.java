package Q02;

public class Contato implements Comparable<Contato>{

	private String nome, email;
	private long numero;
	
	public Contato(String nome, String email, long numero) {
		super();
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(Contato o) {
		return o.getNome().compareTo(this.getNome());
	}
}
