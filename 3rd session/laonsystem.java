public class laonsystem {

    public String loan(int age, String work, int income,
                       int creditScore, int loanAmount) {

        if (age >= 21 && age <= 60) {

            if (work.equals("salaried")) {
                if (income >= 25000 && creditScore >= 650
                        && loanAmount <= 10 * income) {
                    return "Approved";
                }
            }

            else if (work.equals("self-employed")) {
                if (income >= 500000 && creditScore >= 700
                        && loanAmount <= 5 * income) {
                    return "Approved";
                }
            }

            else if (work.equals("business")) {
                if (income >= 1000000 && creditScore >= 750
                        && loanAmount <= 5 * income) {
                    return "Approved";
                }
            }
        }

        return "Rejected";
    }

    public static void main(String[] args) {

        laonsystem obj = new laonsystem();

        String result=obj.loan(25, "salaried", 30000, 700, 200000);

        System.out.println(result);
    }
}