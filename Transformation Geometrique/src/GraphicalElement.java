import interaction.Painter;

import java.util.Vector;

public abstract class GraphicalElement {



    int x,y;
    public abstract void draw(Painter painter);

    public abstract void translate (Vector<Point> vector);

    public abstract void rotate(double angle);

    public abstract void rotate(Point centre, double angle);

}
