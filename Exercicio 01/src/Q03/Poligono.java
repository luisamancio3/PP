package Q03;

import java.util.ArrayList;
import java.util.List;

public class Poligono {

	private List<Ponto> pontos;

	public Poligono() {
		this.pontos = new ArrayList<Ponto>();
	}

	public List<Ponto> getPontos() {
		return pontos;
	}

	public void addPonto(Ponto p) {
		this.pontos.add(p);
	}

	public void removePonto(Ponto p) {
		this.pontos.remove(p);
	}
	
	public void removePonto(int i) {
		this.pontos.remove(i);
	}
	
	public double area() {
		double somatorio = 0;
		for (int i = 0; i < this.pontos.size() - 1; i++) {
			somatorio += this.calcPonto(this.pontos.get(i), this.pontos.get(i + 1));
		}
		
		return somatorio / 2;
	}
	
	@Override
	public String toString() {
		return "Pontos: " + this.pontos.toString() + "\nArea: " + this.area();
	}

	private double calcPonto(Ponto p1, Ponto p2) {
		return (p1.getX() * p2.getY()) - (p2.getX() * p1.getY());
	}
}
