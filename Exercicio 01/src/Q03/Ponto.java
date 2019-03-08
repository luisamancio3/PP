package Q03;

import java.util.List;

public class Ponto {

	private double x, y;

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ponto) {
			Ponto p = (Ponto) obj;
			if(p != null && p.getX() == this.x && p.getY() == this.y) return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Coordenada X: " + this.x + "\nCoordenada Y: " + this.y;
	}
	
	
}
