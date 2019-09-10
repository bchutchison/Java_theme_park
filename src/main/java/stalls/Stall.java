package stalls;

import behaviours.ISites;
import behaviours.IReviewed;

public abstract class Stall implements IReviewed, ISites {
    private int rating;
    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
