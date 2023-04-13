package ke.co.safaricom;

public class Account {
    public static int NUM_OF_ACCOUNTS = 0;
    private String accountName;
    private String phoneNumber; // 0700000000EXT1,
    private double accountBalance;

    public Account() {
        NUM_OF_ACCOUNTS++;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdraw(double amount){
        double fee = 100;
        double txnAmount = amount+fee;
        double currentBalance = this.getAccountBalance();
        if (txnAmount > currentBalance){
            System.out.println("Not enough money in your account");
        } else {
            this.setAccountBalance(currentBalance - txnAmount);
            System.out.println(this.getAccountBalance());
        }
    }
}
