import org.junit.Test;

public class pruebaCirculoBorjaVidal {

    @Test
    public void testCalcularArea() {
        Circulo_BVL c1 = new Circulo_BVL(7, "circulo");
        c1.area();
        c1.perimetro();

        Circulo_BVL c2 = new Circulo_BVL(0, "circulo");
        c2.area();
        c2.perimetro();

        Circulo_BVL c3 = new Circulo_BVL(-3, "circulo");
        c3.area();
        c3.perimetro();

    }
}