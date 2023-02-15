
public class Rectangulo_BVL extends FiguraGeometrica_BVL {
	private double l1;
	private double l2;
	
	public Rectangulo_BVL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	public double area() {
		return l1 * l2;
	}
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
