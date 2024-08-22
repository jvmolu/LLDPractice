package problems.zoomcar;

import problems.zoomcar.product.Vehicle;

import java.util.ArrayList;

public class VehicleManager {

    ArrayList<Vehicle> vehicles;
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    public void updateVehicle(Vehicle vehicle) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleID() == vehicle.getVehicleID()) {
                v = vehicle;
            }
        }
    }
    public Vehicle getVehicleById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID() == id) {
                return vehicle;
            }
        }
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByType(String type) {
        ArrayList<Vehicle> vehiclesByType = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equals(type)) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;
    }






}
