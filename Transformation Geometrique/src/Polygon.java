import interaction.Painter;

import java.util.Vector;

public class Polygon extends Forme {
    protected Point[] sommets;
    public double longueur;
    public double compteurX;
    public double compteurY;
    public double x;
    public double y;
    public int xz,yz;

    public Polygon(Point[] sommets){ this.sommets=sommets; }
    protected Polygon(int nbrSommets){ }
    public Point getSommet(int i){
     return sommets[i];
    }
    public double perimetre(){
        double peri=0;
        for (int j=0;j<sommets.length;j++){
            peri =peri+=sommets[(j+1)%sommets.length].distance(sommets[j%sommets.length]);
        }
        return peri;
    }
    public String toString(){
        String s ="";
        for(int i=0;i<sommets.length;i++) {
            s=s+"("+sommets[i].x+","+sommets[i].y+")";
            if(i==sommets.length-1)
                s=s+"";
            else
                s=s+" ; ";
        }
        return "[ "+s+" ]";
    }

    public void draw(Painter painter){

        for (int j=0;j<sommets.length;j++){
        longueur= Math.max(Math.abs(sommets[(j+1)%sommets.length].x-sommets[j%sommets.length].x),
                Math.abs(sommets[(j+1)%sommets.length].y-sommets[j%sommets.length].y));
        compteurX =(sommets[(j+1)%sommets.length].x-sommets[j%sommets.length].x)/longueur;
        compteurY =(sommets[(j+1)%sommets.length].y-sommets[j%sommets.length].y)/longueur;
        x= sommets[j%sommets.length].x +0.5;
        y= sommets[j%sommets.length].y +0.5;

        for (int i=0;i<longueur;i++){
            painter.setPixel(Math.round(((float) x)),Math.round(((float) y)),true);
            x=x+compteurX;
            y=y+compteurY;
        }
        Painter.delay();
        }
    }

    @Override
    public void translate(Vector<Point> vector) {
        for (int i =0;i<sommets.length;i++){
            sommets[i].x=sommets[i].x+vector.get(0).x;
            sommets[i].y=sommets[i].y+vector.get(0).y;
        }
    }

    @Override
    public void rotate(double angle) {
        for (int i =0;i<sommets.length;i++){
            xz=Math.round((float) ( sommets[i].x * Math.cos (Math.toRadians(angle)) +  sommets[i].y * Math.sin (Math.toRadians(angle))));
            yz=Math.round((float) (-  sommets[i].x * Math.sin (Math.toRadians(angle)) +  sommets[i].y * Math.cos (Math.toRadians(angle))));
            sommets[i].x=xz;
            sommets[i].y=yz;
        }
    }

    @Override
    public void rotate(Point centre, double angle) {
        for (int i =0;i<sommets.length;i++){
            sommets[i].x=sommets[i].x-centre.x;
            sommets[i].y=sommets[i].y-centre.y;
            xz=Math.round((float) ( sommets[i].x * Math.cos (Math.toRadians(angle)) +  sommets[i].y * Math.sin (Math.toRadians(angle))+ centre.x));
            yz=Math.round((float) (-  sommets[i].x * Math.sin (Math.toRadians(angle)) +  sommets[i].y * Math.cos (Math.toRadians(angle))+ centre.x));
            sommets[i].x=xz;
            sommets[i].y=yz;
        }
    }
}



