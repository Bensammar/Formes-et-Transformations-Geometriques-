import interaction.Painter;

import java.util.Scanner;
import java.util.Vector;

public class PictureTest {

    public static void main(String[] args) {
//////////////////////////////////////////////////// Polygone //////////////////////////////////////////////////////////
        Point p1 = new Point(50, 100);
        Point p2 = new Point(100, 100);
        Point p3 = new Point(120, 120);
        Point p4 = new Point(100, 150);
        Point p5 = new Point(50, 150);
        Point p6 = new Point(30, 120);
        int x;
        Scanner sc =new Scanner(System.in);
        System.out.println("choisir '1' pour translation ou '2' pour retation autour d'un point ou '3' pour retation autour du centre ");
        x=sc.nextInt();
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
        Point pc = new Point(20, 20);
////////////////////////////////////////////////////// Cercle //////////////////////////////////////////////////////////
        Cercle cercle =new Cercle(p1,5);
        System.out.println(cercle.perimetre());
////////////////////////////////////////////////////// Segment /////////////////////////////////////////////////////////
        segment s1 = new segment(new Point(20, 5), new Point(20, 105)); // segment vertical de 100 pixels
        segment s2 = new segment(new Point(150, 125), new Point(180, 140)); // segment oblique, à peu près au centre d'une fenêtre 300*300



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Vector<Point> vector= new Vector<Point>();
        Point povec1 = new Point(5, 5);
        vector.add(povec1);


        if(x==1) {
            Picture picture = new Picture(300, 300, new GraphicalElement[]{p11,p22,p33,s1,s2},new Polygon[]{polygon,triangle,rectangle});
            while (true) {
                Painter.delay(10);
                picture.translateElement(vector);
                picture.display();
            }}
        else if(x==2){
            Picture picture1 = new Picture(300, 300, new GraphicalElement[]{p11,p22,p33,s1,s2},new Polygon[]{polygon,triangle,rectangle});

            while (true) {
                /////////////////////////////////////////////////////////////////////
                picture1.rotateElements(new Point(150, 150), 20);
                picture1.display();}}
        else {
            Picture picture2 = new Picture(300, 300, new GraphicalElement[]{p11,p22,p33,s1,s2},new Polygon[]{polygon,triangle,rectangle});
            while (true) {
                /////////////////////////////////////////////////////////////////////
                Painter.delay(10);
                picture2.rotateElements(5);
                picture2.display();
            }
        }}
    }
