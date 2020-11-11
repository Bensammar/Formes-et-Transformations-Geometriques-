import interaction.Painter;

public class segment extends GraphicalElement{
    public Point p1;
    public Point p2;
    public double longueur;
    public double compteurX;
    public double compteurY;
    public double x;
    public double y;
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
}
