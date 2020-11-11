public class Rectangle extends Polygon {

    public double xMin,xMax,yMin,yMax;
    public Rectangle(Point[] sommets, double xMin, double xMax, double yMin, double yMax) {
        super(sommets);
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
    }
    public boolean estParallelogramme(){
        double A,B,C,D;
        A=Math.abs(sommets[0].x-sommets[1].x);
        B=Math.abs(sommets[0].y-sommets[1].y);
        C=Math.abs(sommets[2].x-sommets[3].x);
        D=Math.abs(sommets[2].y-sommets[3].y);
        if (A==C && B==D)
            return true;
        else
            return false;
    }

}
