import interaction.Painter;

public class Polygon extends Forme {
    protected Point[] sommets;
    public double longueur;
    public double compteurX;
    public double compteurY;
    public double x;
    public double y;

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
    }



