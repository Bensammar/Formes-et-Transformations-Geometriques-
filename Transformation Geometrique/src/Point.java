import interaction.Painter;

import java.awt.*;
import java.util.Vector;

public class Point extends GraphicalElement{

    public int x,y;
    public int xz,yz;

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

    @Override
    public void translate(Vector<Point> vector) {

        this.x=this.x+vector.get(0).x;
        this.y=this.y+vector.get(0).y;

    }

    @Override
    public void rotate(double angle) {
         x = Math.round((float) ( x * Math.cos (Math.toRadians(angle)) +  y * Math.sin (Math.toRadians(angle))));
         y = Math.round((float) (-  x * Math.sin (Math.toRadians(angle)) +  y * Math.cos (Math.toRadians(angle))));
    }

    @Override
    public void rotate(Point centre, double angle) {
        x = x - centre.x;
        y = y - centre.y;
        xz = Math.round((float) (x * Math.cos (Math.toRadians(angle)) + y * Math.sin (Math.toRadians(angle)) + centre.x));
        yz = Math.round((float) (- x * Math.sin (Math.toRadians(angle)) + y * Math.cos (Math.toRadians(angle)) + centre.y));

        System.out.println(x+"      "+y);

        x=xz;
        y=yz;
        rotate(angle);
    }

    public double distance (Point p){
        return Math.sqrt(((p.x-this.x)*(p.x-this.x))+((p.y-this.y)*(p.y-this.y)));
    }
}
