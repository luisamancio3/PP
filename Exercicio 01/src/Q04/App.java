package Q04;

public class App {
	public static void main(String[] args) {
		Bits b1 = new Bits(10);
		Bits b2 = new Bits(10);	
		
		b1.setBit('1');
		b1.setBit('1');
		b1.setBit('0');
		b1.setBit('0');
		b1.setBit('0');
		b1.setBit('1');
		b1.setBit('0');
		

		b2.setBit('1');
		b2.setBit('0');
		b2.setBit('1');
		b2.setBit('0');
		b2.setBit('0');
		b2.setBit('1');
		b2.setBit('0');

	
		
		System.out.println(b1.not(b2.getBits()));
	}
}
