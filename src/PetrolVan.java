public class PetrolVan extends Vehicle{

    private double loadCapacity;
    private double pricePerDay;
    static double insuranceRate = 0.08;

    PetrolVan(String regNo,String make,double loadCapacity,double pricePerDay){
        super(regNo,make);
        this.loadCapacity=loadCapacity;
        this.pricePerDay=pricePerDay;
    }

    public double getLoadCapacity(){
        return loadCapacity;
    }
    public double getPricePerDay(){
        return pricePerDay;
    }
    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity=loadCapacity;
    }

    public void setPricePerDay(double pricePerDay){
        this.pricePerDay=pricePerDay;
    }

    public double getHireCost(int days){
            return (days*pricePerDay)+insuranceRate*(days*pricePerDay);

    }

    @Override
    public String toString() {
        return super.toString()+String.format(" hire cost(3days): %.2f",getHireCost(3));
    }
}
