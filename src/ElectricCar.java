public class ElectricCar extends Vehicle{


    private double batteryCapacity;
    private double pricePerDay;
    static double insuranceRate =0.05;



    ElectricCar(String regNo,String make,double batteryCapacity,double pricePerDay){
        super(regNo,make);
        this.batteryCapacity = batteryCapacity;
        this.pricePerDay = pricePerDay;

    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getHireCost(int days){
        return (pricePerDay*days) + insuranceRate*(pricePerDay*days);
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" hire cost(3days): %.2f",getHireCost(3));

    }

}
