public class Vehicle {

    private String regNo;
    private String make;
    static int noVehicles;

    Vehicle(String regNo, String make) {
        this.regNo = regNo;
        this.make = make;
        noVehicles++;
    }

    public int  getNoVehicles(){
        return noVehicles;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setReNo(String regNo) {
        this.regNo = regNo;

    }

    public String getMake() {
        return make;

    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return String.format("reg: %s ,make: %s", regNo, make);
    }
}

