public class Square extends Regtangle{

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) { super(side, side, color, filled); }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) { super.setLength(length); }

    @Override
    public String toString() {
        return "A Square with side="+length+
                ", which is a subclass of " + super.toString() ;
    }

}

