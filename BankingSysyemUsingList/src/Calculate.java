public class Calculate {
    public static void main(String[] args) {

            Bank bank = new Bank(1001,"Kamal Disanayaka","saving",500000);

            System.out.println(bank.accNumber + " " + bank.cusName + " " + bank.accType + " " + bank.accBalance + " " + bank.interest + " " + bank.totalBalance );
    }
}
