package zavdannya3;

public class Plane extends Vehicle {
    int height;
    int howManyPeople;
    String model;
    public Plane(){

    }

    public Plane(int praice, int speed, int yearBuild,int height,int howManyPeople,String model){

        super(praice,speed,yearBuild);
        this.height=height;
        this.howManyPeople=howManyPeople;
        this.model = model;
    }

}
