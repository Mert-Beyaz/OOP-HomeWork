public class Regtangle extends Shape{

    double width;
    double length;

    public Regtangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Regtangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Regtangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return width * length;
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+
        "and length="+length+", which is a subclass of " + super.toString();
    }
}
