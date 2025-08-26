package parkingLot;

public class ParkingSpot {

    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }

}
