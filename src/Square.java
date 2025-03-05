public class Square extends Form implements Mesurable{

    private double side;

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
