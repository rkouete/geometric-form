public class Rectangle extends Form implements Mesurable{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("White");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
