
//Before applying Lod principle
class NotificationService{
  
     public void sendRideUpdate(Ride ride){
        String driverName = ride.getDriver().getProfile().getName();

        String plate = ride.getDriver().getVehicle().getRegistrationPlate();

        String phone = ride.getDriver().getProfile().getPhone();

     }
}

//After applying Lod principle

class Ride {
    private Driver driver;
    private Passenger passenger;

    // ... constructor, other methods ...

    public String getDriverName() {
        return driver.getProfile().getFullName();
    }

    public String getVehiclePlate() {
        return driver.getVehicle().getRegistration().getLicensePlate();
    }

    public String getPassengerPhone() {
        return passenger.getContactInfo().getPhoneNumber();
    }
}
class NotificationService {
    public void sendRideUpdate(Ride ride) {
        String driverName = ride.getDriverName();
        String plate = ride.getVehiclePlate();
        String phone = ride.getPassengerPhone();

        String message = String.format(
            "Your driver %s is arriving in a %s. Contact: %s",
            driverName, plate, phone);
        System.out.println("SMS to " + phone + ": " + message);
    }
}