public class Lab04Main
{
    public static void main(String[] args)
    {
        StaffMember.showSystemName();

        UniversityPolicy.showPolicyHeader();

        System.out.println("University: "
                + UniversityPolicy.UNIVERSITY_NAME);

        Lecturer lecturer1 = new Lecturer(
                "Nimal Perera",
                "L001",
                "Computer Science",
                3,
                45000
        );

        Lecturer lecturer2 = new Lecturer(
                "Kasun Silva",
                "L002",
                "Information Technology",
                2,
                50000
        );

        LabAssistant assistant1 = new LabAssistant(
                "Saman Kumara",
                "LA001",
                "Networking",
                120,
                850
        );

        // controlled department update
        lecturer2.changeDepartment("Software Engineering");

        lecturer1.displayLecturerDetails();
        System.out.println("Monthly Payment: "
                + lecturer1.calculateMonthlyPayment());

        System.out.println("Bonus: "
                + UniversityPolicy.calculateBonus(
                        lecturer1.calculateMonthlyPayment()
                ));

        lecturer2.displayLecturerDetails();
        System.out.println("Monthly Payment: "
                + lecturer2.calculateMonthlyPayment());

        System.out.println("Bonus: "
                + UniversityPolicy.calculateBonus(
                        lecturer2.calculateMonthlyPayment()
                ));

        assistant1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: "
                + assistant1.calculateMonthlyPayment());

        System.out.println("Bonus: "
                + UniversityPolicy.calculateBonus(
                        assistant1.calculateMonthlyPayment()
                ));

        double totalPayment =
                lecturer1.calculateMonthlyPayment()
                + lecturer2.calculateMonthlyPayment()
                + assistant1.calculateMonthlyPayment();

        System.out.println("\nTotal Monthly Payment: "
                + totalPayment);

        System.out.println("Total Staff Objects: "
                + StaffMember.getStaffCount());

        lecturer1.showCommonNotice();
        lecturer2.showCommonNotice();
        assistant1.showCommonNotice();

        // changeDepartment() is useful because it allows safe updates without direct access
    }
}