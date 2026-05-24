package Lab6;

public class Member {

    private String memberName;
    private String membershipType;
    private boolean newsletter;
    private int months;

    public Member(String memberName, String membershipType,
            boolean newsletter, int months) {

        this.memberName = memberName;
            this.membershipType = membershipType;
        this.newsletter = newsletter;
        this.months = months;

    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getMonths() {
        return months;
    }

    public String getNewsletterText() {
        return newsletter ? "Yes" : "No";
    }

    public double getMonthlyFee() {

        if (membershipType.equals("Premium")) {
            return 2500;
        }
        else {
            return 1000;
        }
    }

    public double getTotalFee() {

        double total = getMonthlyFee() * months;

        if (newsletter) {
            total = total + 200;
        }

        return total;
    }
}