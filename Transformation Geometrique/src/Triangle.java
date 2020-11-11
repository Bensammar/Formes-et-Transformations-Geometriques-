import interaction.Painter;

public class Triangle extends Polygon{



    public Triangle(Point[] sommets, Point a, Point b, Point c) {
        super(sommets);
        sommets[0] = a;
        sommets[1] = b;
        sommets[2] = c;
    }

    public boolean estTriangleRectangle(){
        System.out.println(("("+sommets[0].distance(sommets[1])+")² +  ("+(sommets[1].distance(sommets[2]))+")² = ("+(sommets[0].distance(sommets[2]))+")²"));
        if((((sommets[0].distance(sommets[1])*(sommets[0].distance(sommets[1])))+((sommets[1].distance(sommets[2]))
            *(sommets[1].distance(sommets[2]))))==Math.round((sommets[0].distance(sommets[2]))*(sommets[0].distance(sommets[2])))))
            return true;
        else
            return false;

    }


}
