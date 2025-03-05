public class Disc extends Circle implements Mesurable{

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
