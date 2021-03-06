package Q04;

import java.util.ArrayList;
import java.util.List;

public class Bits {
	private ArrayList<Boolean> bits;

	public Bits(int size) {
		this.bits = new ArrayList<Boolean>(size);
	}

	private void toString(String b) {
		for (String s : b.split("")) {
			this.bits.add(s.equals("1"));
		}

	}

	public String getBits() {
		StringBuilder s = new StringBuilder();

		for (Boolean b : this.bits) {
			s.append(b == true ? '1' : '0');
		}

		return s.toString();
	}

	public void setBits(String bits) {
		this.toString(bits);
	}

	public char getBit(int index) throws IllegalArgumentException {
		if (index > this.bits.size() || index < 0) {
			throw new IllegalArgumentException("Index invalido");
		}
		return this.bits.get(index) == true ? '1' : '0';
	}
	
	public void setBit(char c) {
		this.bits.add(c == '1' ? true : false);
	}

	public void setBit(String s, int index) throws IllegalArgumentException {
		if (index > this.bits.size() || index < 0) {
			throw new IllegalArgumentException("Index invalido");
		}
		this.bits.add(index, s.equals("1") ? true : false);
	}

	public String and(String s) {
		ArrayList<Boolean> aux = this.toBoolean(s);
		return calc(Operações.AND, aux, this.bits);
	}

	public String or(String s) {
		ArrayList<Boolean> aux = this.toBoolean(s);
		return calc(Operações.OR, aux, this.bits);
	}

	public String not(String s) {
		ArrayList<Boolean> aux = this.toBoolean(s);
		return calc(Operações.NOT, aux, this.bits);
	}

	private String calc(Operações o, ArrayList<Boolean> b1, List<Boolean> b2) {
		StringBuilder aux = new StringBuilder();

		switch (o) {
		case AND:
			for (int i = 0; i < b1.size(); i++) {
				aux.append(b1.get(i) && b2.get(i) ? "1" : "0");
			}
			break;
		case OR:
			for (int i = 0; i < b1.size(); i++) {
				aux.append(b1.get(i) || b2.get(i) ? "1" : "0");
			}
			break;
		case NOT:
			for (int i = 0; i < b1.size(); i++) {
				aux.append(b1.get(i) != b2.get(i) ? "1" : "0");
			}
			break;

		default:
			break;

		}
		return aux.toString();
	}

	private ArrayList<Boolean> toBoolean(String s) {
		ArrayList<Boolean> aux = new ArrayList<Boolean>();

		for (String c : s.split("")) {
			aux.add(c.equals("1") ? true : false);
		}

		return aux;
	}

	@Override
	public String toString() {
		return this.getBits();
	}

}