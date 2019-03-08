package Q01;

public class Retangulo {

	private int altura, largura;

	public Retangulo() {
		this.altura = 0;
		this.largura = 0;
	}

	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public int getPerimetro() {
		return (this.altura + this.largura) * 2;
	}
	
	public int getArea() {
		return this.altura * this.largura;
	}

	@Override
	public String toString() {
		return "Altura: " + this.altura + "/n" + "Largura: " + this.largura;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Retangulo) {
			Retangulo r = (Retangulo) obj;
			if(r != null && r.altura == this.altura && r.largura == this.largura) return true;
		}
		return false;
	}

}
