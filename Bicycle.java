public class Bicycle {
    private final String name = "Bicycle";
    private final String brand = "Lumala";
    private String color;
    private double speed;
    private double currentWeight;

    public double setSpeed(double goSpeed){
        speed = goSpeed;
        return goSpeed;
    }
    public double setCurrentWeight(){
        return currentWeight;
    }
}
// Circle
class Circle{
    private String name;
    private String material;
    private String color;
    private double radius;

    public void setRadius(double radius){
        radius = 10;
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

    public void increaseVolume(int upvVolume,int downVolume){
        volume = upvVolume;
        volume = downVolume;
    }
    public void tuneChannel(double tuneUp, double tuneDown){
        channel = tuneUp;
        this.channel = tuneDown;
    }
}