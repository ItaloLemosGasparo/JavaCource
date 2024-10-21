class BankAccount {
    private String owner;
    private double balance;

    public BankAccount() {
        this("", 0.0);
    }

    public BankAccount(String owner) {
        this(owner, 0.0);
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void subtractBalance(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    public double checkBalance() {
        return balance;
    }
}
