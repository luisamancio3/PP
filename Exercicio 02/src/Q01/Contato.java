package Q01;

public class Contato {
	
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
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		Contato c = (Contato) obj;
		if(!email.equals(c.email) || !nome.equals(c.nome))
			return false;
		if(numero != c.numero)
			return false;
		return true;
	}
}
