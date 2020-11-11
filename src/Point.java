import interaction.Painter;

import java.awt.*;

public class Point extends GraphicalElement{

    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void draw(Painter painter){
        painter.setPixel(x, y, Color.red);
    }

    public double distance (Point p){
        return Math.sqrt(((p.x-this.x)*(p.x-this.x))+((p.y-this.y)*(p.y-this.y)));
    }
}
