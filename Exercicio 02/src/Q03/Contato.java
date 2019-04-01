package Q03;

public class Contato {
	
	private String email;
	private long numero;
	
	public Contato(String email, long numero) {
		super();
		this.email = email;
		this.numero = numero;
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
		if(numero != c.numero)
			return false;
		if(email != c.email)
			return false;
		return true;
	}
}
