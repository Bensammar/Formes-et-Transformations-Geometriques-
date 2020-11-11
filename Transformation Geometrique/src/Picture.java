import interaction.Painter;

import java.util.Vector;

public class Picture {

    public int height, width;
    public GraphicalElement[] graphicalElements;
    public Painter painter;
    public Polygon[] polygons;


    public Picture(int height, int width, GraphicalElement[] graphicalElements, Polygon[] polygons) {
        painter = new Painter(height, width);
        this.height = height;
        this.width = width;
        this.graphicalElements=graphicalElements;
        this.polygons=polygons;

    }

    public void display() {

        for (int i = 0; i < graphicalElements.length; i++) {
            graphicalElements[i].draw(painter);
        }

        for (int i = 0; i < polygons.length; i++) {
            polygons[i].draw(painter);
        }
    }
    public void translateElement(Vector<Point> vector){
        for (int i = 0; i < graphicalElements.length; i++) {
            graphicalElements[i].translate(vector);
            Painter.delay(200);
        }
        for (int i = 0; i < polygons.length; i++) {
            polygons[i].translate(vector);
            Painter.delay(200);
        }
    }
    public void rotateElements(double angle){
        for (int i = 0; i < graphicalElements.length; i++) {
            graphicalElements[i].rotate(angle);
            Painter.delay(200);
        }
        for (int i = 0; i < polygons.length; i++) {
            polygons[i].rotate(angle);
            Painter.delay(200);
        }
    }

    public void rotateElements(Point center,double angle){
        for (int i = 0; i < graphicalElements.length; i++) {
            graphicalElements[i].rotate(center,angle);
            Painter.delay(200);
        }
        for (int i = 0; i < polygons.length; i++) {
            polygons[i].rotate(center,angle);
            Painter.delay(200);
        }
    }
}