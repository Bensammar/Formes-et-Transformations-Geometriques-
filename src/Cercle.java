public class Cercle extends Forme{
    public Point centre;
    public double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2*Math.PI*rayon;
    }

}
