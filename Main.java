class Point {
    int x,y;
}
class TwoPoints {
    public static void main(String[] args) {
        Point p1=new Point();
        Point p2=new Point();
        Point p3=new Point();
        p1.x=10;
        p1.y=20;
        p2.x=42;
        p2.y=67;
        p3.y=78;
        p3.y=87;
        System.out.println("x=" + p1.x + "y=" +p1.y);
        System.out.println("x=" + p2.x + "y=" +p2.y);
        System.out.println("x=" + p3.x + "y=" +p3.y);
    }
}
