import interaction.Painter;

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
}