/**
 * @author borja vidal lópez
 * @version 1.2
 */
public class Rectangulo_BVL extends FiguraGeometrica_BVL {
	private double l1;
	private double l2;
	
	public Rectangulo_BVL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Multiplica la variable l1 por la variable l2
	 * @return l1 * l2
	 */
	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 * Resultado de la suma de multiplicar por 2 las variables l1 y l2
	 * @return (2 * l1) + (2 * l2)
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
