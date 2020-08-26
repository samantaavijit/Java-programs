package com.avijitsamanta.Collage;

public class VehicleMain {

    static class Vehicle {
        private String vehicleName;
        private String vehiclePrice;

        public Vehicle() {
            this.vehicleName = null;
            this.vehiclePrice = null;
        }

        public String getVehicleName() {
            return "Name- "+vehicleName;
        }

        public void setVehicleName(String vehicleName) {
            this.vehicleName = vehicleName;
        }

        public String getVehiclePrice() {
            return "Price- Rs." + vehiclePrice;
        }

        public void setVehiclePrice(String vehiclePrice) {
            this.vehiclePrice = vehiclePrice;
        }

    }

    static class TwoWheeler extends Vehicle {
        private String brandName;
        private String modelNo;

        public TwoWheeler() {
            this.brandName = null;
            this.modelNo = null;
        }

        public String getBrandName() {
            return "Brand- "+brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getModelNo() {
            return "Model- "+modelNo;
        }

        public void setModelNo(String modelNo) {
            this.modelNo = modelNo;
        }
    }

    static class FourWheeler extends Vehicle {
        private String fuelType;
        private String brandName;
        private String modelName;
        private String mileage;

        public FourWheeler() {
            this.fuelType = null;
            this.brandName = null;
            this.mileage = null;
            this.modelName = null;
        }

        public String getFuelType() {
            return "Fuel- " + fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public String getBrandName() {
            return "Brand- " + brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getModelName() {
            return "Model- " + modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getMileage() {
            return "Mileage- " + mileage;
        }

        public void setMileage(String mileage) {
            this.mileage = mileage;
        }
    }

    static class Car extends FourWheeler {
        private String noOfSeat;

        public Car() {
            this.noOfSeat = null;
        }

        public String getNoOfSeat() {
            return "Seat capacity- " + noOfSeat;
        }

        public void setNoOfSeat(String noOfSeat) {
            this.noOfSeat = noOfSeat;
        }
    }

    static class Truck extends FourWheeler {
        private String loadCapacity;

        public Truck() {
            this.loadCapacity = null;
        }

        public String getLoadCapacity() {
            return "Load capacity- " + loadCapacity;
        }

        public void setLoadCapacity(String loadCapacity) {
            this.loadCapacity = loadCapacity;
        }
    }

    public static void main(String[] args) {

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.setVehicleName("Bicycle");
        twoWheeler.setVehiclePrice("5000");
        twoWheeler.setBrandName("Hero");
        twoWheeler.setModelNo("AefT-234Q");
        System.out.println(twoWheeler.getVehicleName());
        System.out.println(twoWheeler.getBrandName());
        System.out.println(twoWheeler.getModelNo());
        System.out.println(twoWheeler.getVehiclePrice());

        Car car = new Car();
        car.setVehicleName("Bolero");
        car.setVehiclePrice("917190");
        car.setBrandName("Mahindra");
        car.setFuelType("Diesel");
        car.setNoOfSeat("10");
        car.setModelName("EOI-258-201-SRG");
        car.setMileage("17 km/l");

        System.out.println("-----------------------");

        System.out.println(car.getVehicleName());
        System.out.println(car.getBrandName());
        System.out.println(car.getVehiclePrice());
        System.out.println(car.getMileage());
        System.out.println(car.getNoOfSeat());
        System.out.println(car.getFuelType());
        System.out.println(car.getModelName());

        System.out.println("-----------------------");

        Truck truck = new Truck();
        truck.setVehicleName("TLC");
        truck.setVehiclePrice("1200000");
        truck.setBrandName("TATA MOTORS");
        truck.setFuelType("Diesel");
        truck.setMileage("12 km/l");
        truck.setLoadCapacity("16.2 tonnes");
        truck.setModelName("TEW25-TYSS-25");

        System.out.println(truck.getVehicleName());
        System.out.println(truck.getBrandName());
        System.out.println(truck.getVehiclePrice());
        System.out.println(truck.getMileage());
        System.out.println(truck.getLoadCapacity());
        System.out.println(truck.getFuelType());
        System.out.println(truck.getModelName());
    }
}
