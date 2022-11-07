package zavdannya3;

public class Car extends Vehicle {
 String model;
    public Car(){

    }

    public Car(int praice, int speed, int yearBuild,String model){
        super(praice, speed, yearBuild);
        this.model=model;
    }

}
