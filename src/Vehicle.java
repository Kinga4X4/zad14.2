public class Vehicle {
    private String typ;
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String vinNumber;

    public Vehicle(String typ, String brand, String model, int year, int mileage, String vinNumber) {
        this.typ = typ;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.vinNumber = vinNumber;
    }


    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typ='" + typ + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", vinNumber=" + vinNumber +
                '}';
    }

}
