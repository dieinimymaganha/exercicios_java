package A02_oo_i;

public class Ponto2D {

    public double x, y;

    public Ponto2D() {
        x = 0;
        y = 0;
    }

    public Ponto2D(double px, double py) {
        x = px;
        y = py;
    }

    public double distancia(double px, double py) {
        return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
    }

    public double distancia(Ponto2D p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public String toString() {
        return "Ponto2D[x=" + x + ",y=" + y + "]";
    }
}
