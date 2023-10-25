public class Bicycle {
    final String name = "Bicycle";
    private final String brand = "Lumala";
    private String color;
    private double speed;
    double currentWeight = 50;


    public void setSpeed(double Speed){
        this.speed = Speed;
    }
    public void getSpeed(){
        System.out.println(speed);
    }
    public double Weight(){
        return currentWeight;
    }

    public void getName() {
        System.out.println(name);
    }
}
// Circle
class Circle{
    private String name;
    private String material;
    private String color;
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return radius * 2;
    }
    public double getArea(){
        return (Math.PI * radius * radius);
    }
}
// House

class House {
    private String name;
    private String address;
    private String material;
    private String color;
    private int rooms;
    private int persons;
    public void currentLivePersons(int stayPerson){
        persons = stayPerson;
    }
    public int getRooms(){
        return rooms;
    }
}
// radio

class Radio{
    private String name;
    private String brand;
    private String speaker;
    private double volume;
    private double channel;

    public void increaseVolume(int upvVolume){
        this.volume = upvVolume;

    }
    public void getVolume(){
        System.out.println(volume);
    }
    public void tuneChannel(double tuneUp){
        channel = tuneUp;
    }
    public void getChannel(){
        System.out.println(channel);
    }
}
