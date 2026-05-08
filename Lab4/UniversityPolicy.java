final class UniversityPolicy
{
    public static final String UNIVERSITY_NAME = "University of Kelaniya";

    public static final double BONUS_RATE = 0.10;

    public static void showPolicyHeader()
    {
        System.out.println("\n===== University Payment Policy =====");
    }

    public static double calculateBonus(double monthlyPayment)
    {
        return monthlyPayment * BONUS_RATE;
    }

    // final class should not be inherited because university rules should remain unchanged
}