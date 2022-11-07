package zavdannya3;

public class Ship extends Vehicle{
    int howManyPeople;
    String portOfRegistration;
    String model;

    public Ship(){

    }

    public Ship(int praice, int speed, int yearBuild,int howManyPeople,String portOfRegistration,String model){
        super(praice,speed,yearBuild);
        this.howManyPeople = howManyPeople;
        this.portOfRegistration = portOfRegistration;
        this.model = model;
    }
}
