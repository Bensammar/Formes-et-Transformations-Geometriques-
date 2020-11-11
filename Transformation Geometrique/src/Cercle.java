import interaction.Painter;

import java.util.Vector;

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

    @Override
    public void draw(Painter painter) {

    }

    @Override
    public void translate(Vector<Point> vector) {

    }

    @Override
    public void rotate(double angle) {

    }

    @Override
    public void rotate(Point centre, double angle) {

    }
}
