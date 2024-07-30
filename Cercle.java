public class Cercle extends Forme implements Resizable {
    double diametre = 0;

    public Cercle(double diametre) {
        this.diametre = diametre;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * diametre;
    }

    @Override
    public void resize(double diametre) {
        this.diametre = diametre;
    }
}