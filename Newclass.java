public class Newclass {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.getName();
        bicycle.setSpeed(15);
        bicycle.getSpeed();
        double w = bicycle.Weight();
        System.out.println(w);

        System.out.println();

        Circle circle = new Circle();
        circle.setRadius(20);
        System.out.println(circle.getRadius());
        System.out.println(circle.getDiameter());
        System.out.println(circle.getArea());

        System.out.println();

        Radio radio = new Radio();
        radio.increaseVolume(45);
        radio.getVolume();
        radio.tuneChannel(91.5);
        radio.getChannel();

    }
}
