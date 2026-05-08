public class DeliveryChargeTest
{
    public static void main(String[] args)
    {
        DeliveryChargeCalculator calculator =
                new DeliveryChargeCalculator();

        double charge1 =
                calculator.calculateCharge(1000);

        double charge2 =
                calculator.calculateCharge(1000, 5);

        double charge3 =
                calculator.calculateCharge(1000, 5, 3);

        double charge4 =
                calculator.calculateCharge(1000, true);

        System.out.println("Base Charge Only: " + charge1);

        System.out.println("Charge With Distance: "
                + charge2);

        System.out.println("Charge With Distance and Weight: "
                + charge3);

        System.out.println("Express Delivery Charge: "
                + charge4);

        // this is compile-time polymorphism because Java selects methods using parameter lists
    }
}