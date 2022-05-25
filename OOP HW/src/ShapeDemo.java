public class ShapeDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(5,"blue",false);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Shape rect = new Regtangle(4,6,"yellow",true);
        System.out.println(rect);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Shape sq = new Square(8,"green",true);
        System.out.println(sq);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
    }
}
