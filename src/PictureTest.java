import interaction.Painter;

public class PictureTest {

    public static void main(String[] args) {
//////////////////////////////////////////////////// Polygone //////////////////////////////////////////////////////////
        Point p1 = new Point(50, 100);
        Point p2 = new Point(100, 100);
        Point p3 = new Point(120, 120);
        Point p4 = new Point(100, 150);
        Point p5 = new Point(50, 150);
        Point p6 = new Point(30, 120);

        Polygon polygon =new Polygon(new Point[] {p1, p2, p3 ,p4,p5,p6});
        System.out.println("le perimetre  de ce polygone est : "+polygon.perimetre());
        System.out.println("l affichage des points de Polygone selon la methode toString() : "+polygon.toString());
/////////////////////////////////////////////////// Triangle ///////////////////////////////////////////////////////////
        Point ptriang1 = new Point(50, 200);
        Point ptriang2 = new Point(100, 200);
        Point ptriang3 = new Point(100, 260);

        Triangle triangle = new Triangle(new Point[]{ptriang1,ptriang2,ptriang3},ptriang1,ptriang2,ptriang3);
        if(triangle.estTriangleRectangle())
            System.out.println("le triangle est droit");
        else System.out.println("le triangle n est pas droit");
/////////////////////////////////////////////////// Rectangle //////////////////////////////////////////////////////////
        Point prect1 = new Point(200, 100);
        Point prect2 = new Point(250, 100);
        Point prect3 = new Point(250, 150);
        Point prect4 = new Point(200, 150);

        Rectangle rectangle =new Rectangle(new Point[]{prect1,prect2,prect3,prect4},0,0,0,0);
        if(rectangle.estParallelogramme())
            System.out.println("le rectangle est parallogramme");
        else System.out.println("le rectangle n est pas parallogramme");
////////////////////////////////////////////////////// Point ///////////////////////////////////////////////////////////
        Point p11 = new Point(8, 5);
        Point p22 = new Point(10, 5);
        Point p33 = new Point(8, 10);
////////////////////////////////////////////////////// Cercle //////////////////////////////////////////////////////////
        Cercle cercle =new Cercle(p1,5);
        System.out.println(cercle.perimetre());
////////////////////////////////////////////////////// Segment /////////////////////////////////////////////////////////
        segment s1 = new segment(new Point(20, 5), new Point(20, 105)); // segment vertical de 100 pixels
        segment s2 = new segment(new Point(150, 125), new Point(180, 140)); // segment oblique, à peu près au centre d'une fenêtre 300*300

        Picture picture = new Picture(300, 300, new GraphicalElement[]{p11,p22,p33,s1,s2},new Polygon[]{polygon,triangle,rectangle});
        picture.display();


    }
}