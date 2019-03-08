package Q05;

public class App {
	public static void main(String[] args) {

		FormaGeometrica[] f = new FormaGeometrica[6];
		f[0] = new Retangulo(10, 2.5);
		f[1] = new Retangulo(5, 2.5);
		f[2] = new Quadrado(5);
		f[3] = new Quadrado(4);
		f[4] = new Circulo(2.5);
		f[5] = new Circulo(4.5);

		System.out.print("Lados: ");
		for (FormaGeometrica fg : f) {
			if (fg instanceof Circulo) {
				System.out.println(((Circulo) fg).getRaio());
			} else if (fg instanceof Quadrado) {
				System.out.println(((Quadrado) fg).getLado());
			} else if (fg instanceof Retangulo) {
				System.out.println(((Retangulo) fg).getAltura());
				System.out.println(((Retangulo) fg).getBase());
			}
		}
		
		for (FormaGeometrica fg : f) {
			System.out.println(fg.perimetro());
		}
		
		for (FormaGeometrica fg : f) {
			System.out.println(fg.area());
		}
	}
}
