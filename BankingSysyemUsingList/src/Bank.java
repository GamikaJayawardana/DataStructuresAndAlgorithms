public class Bank {
    int accNumber;
    String cusName;
    String accType;
    double accBalance;
    double interest = calculateInterest(accBalance);
    double totalBalance = calculateTotalBalance(accBalance, interest);

    public Bank(int accNumber, String cusName, String accType, double accBalance) {
        this.accNumber = accNumber;
        this.cusName = cusName;
        this.accType = accType;
        this.accBalance = accBalance;
//        interest = calculateInterest(accBalance);
//        totalBalance = calculateTotalBalance(accBalance,interest);
    }

    private double calculateTotalBalance(double accBalance, double interest) {
        return accBalance + interest;
    }

    private double calculateInterest(double accBalance) {

        double interestRate = 0;
        if (accBalance < 250000) {
            interestRate = 2.5;
        } else if (accBalance < 500000) {
            interestRate = 5.0;
        } else if (accBalance < 750000) {
            interestRate = 7.5;
        } else if (accBalance < 1000000) {
            interestRate = 8.0;
        } else if (accBalance < 1500000) {
            interestRate = 9.5;
        }
        return accBalance * interestRate / 100;
    }
}

