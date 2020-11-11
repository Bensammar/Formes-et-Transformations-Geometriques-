import interaction.Painter;

import java.util.Vector;

public class segment extends GraphicalElement{
    public Point p1;
    public Point p2;
    public double longueur;
    public double compteurX;
    public double compteurY;
    public double x;
    public double y;
    public int rotx1;
    public int roty1;
    public int rotx2;
    public int roty2;
    public segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public void draw(Painter painter){

    longueur= Math.max(Math.abs(p2.x-p1.x),Math.abs(p2.y-p1.y));
    compteurX =(p2.x-p1.x)/longueur;
    compteurY =(p2.y-p1.y)/longueur;
    x= p1.x +0.5;
    y= p1.y +0.5;

    for (int i=0;i<longueur;i++){
    painter.setPixel(Math.round(((float) x)),Math.round(((float) y)), true);
    x=x+compteurX;
    y=y+compteurY;
    }
    }

    @Override
    public void translate(Vector<Point> vector) {

        p1.x = p1.x+vector.get(0).x;
        p1.y = p1.y+vector.get(0).y;
        p2.x = p2.x+vector.get(0).x;
        p2.y = p2.y+vector.get(0).y;
    }

    @Override
    public void rotate(double angle) {

         rotx1= Math.round((float) ( p1.x * Math.cos (Math.toRadians(angle)) +  p1.y * Math.sin (Math.toRadians(angle))));
         roty1= Math.round((float) (-  p1.x * Math.sin (Math.toRadians(angle)) +  p1.y * Math.cos (Math.toRadians(angle))));

         rotx2= Math.round((float) ( p2.x * Math.cos (Math.toRadians(angle)) +  p2.y * Math.sin (Math.toRadians(angle))));
         roty2= Math.round((float) (-  p2.x * Math.sin (Math.toRadians(angle)) +  p2.y * Math.cos (Math.toRadians(angle))));

        p1.x=rotx1;
        p1.y=roty1;
        p2.x=rotx2;
        p2.y=roty2;
    }

    @Override
    public void rotate(Point centre, double angle) {
        p1.x = p1.x - centre.x;
        p1.y = p1.y - centre.y;

        p2.x = p2.x - centre.x;
        p2.y = p2.y - centre.y;

        rotx1= Math.round((float) ( p1.x * Math.cos (Math.toRadians(angle)) +  p1.y * Math.sin (Math.toRadians(angle))+ centre.x));
        roty1= Math.round((float) (-  p1.x * Math.sin (Math.toRadians(angle)) +  p1.y * Math.cos (Math.toRadians(angle))+ centre.x));

        rotx2= Math.round((float) ( p2.x * Math.cos (Math.toRadians(angle)) +  p2.y * Math.sin (Math.toRadians(angle))+ centre.x));
        roty2= Math.round((float) (-  p2.x * Math.sin (Math.toRadians(angle)) +  p2.y * Math.cos (Math.toRadians(angle))+ centre.x));

        p1.x=rotx1;
        p1.y=roty1;
        p2.x=rotx2;
        p2.y=roty2;
    }
}
