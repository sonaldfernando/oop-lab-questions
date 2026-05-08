public class VehicleRentalTest
{
    public static void main(String[] args)
    {
        Vehicle vehicle1 =
                new Car("CAR101",
                        "Toyota",
                        5,
                        8500);

        Vehicle vehicle2 =
                new Bike("BIKE201",
                        "Honda",
                        12,
                        400);

        System.out.println("----- Car Details -----");

        vehicle1.displayVehicleInfo();

        double carCost =
                vehicle1.calculateRentalCost();

        System.out.println("Rental Cost: "
                + carCost);

        System.out.println();

        System.out.println("----- Bike Details -----");

        vehicle2.displayVehicleInfo();

        double bikeCost =
                vehicle2.calculateRentalCost();

        System.out.println("Rental Cost: "
                + bikeCost);

        // this is runtime polymorphism because the method runs based on the actual object type
    }
}