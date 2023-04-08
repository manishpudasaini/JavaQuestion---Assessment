package Question2;
public class Car {
    private int spotId;
    private String make;
    private String licNo;

    public Car( String make, String licNo) {
        this.make = make;
        this.licNo = licNo;
    }

    public int getSpotId() {
        return spotId;
    }
    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }
    public String getMake() {
        return make;
    }
    public String getLicNo() {
        return licNo;
    }
}
