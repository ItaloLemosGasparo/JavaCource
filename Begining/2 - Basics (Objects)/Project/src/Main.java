import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccountList = new ArrayList<>();

        bankAccountList.add(new BankAccount("Ítalo", 100.00));
        bankAccountList.add(new BankAccount("Deise", 111.11));

        printAccountDetails(bankAccountList);

        BankAccount tempBankAccount = bankAccountList.stream()
                .filter(account -> account.getOwner().equals("Ítalo"))
                .findFirst()
                .orElse(null);

        if (tempBankAccount != null)
            tempBankAccount.addBalance(100);
        else
            System.out.println("Account for owner 'Ítalo' not found.");

        printAccountDetails(bankAccountList);
    }

    private static void printAccountDetails(List<BankAccount> bankAccountList) {
        for (BankAccount bankAccount : bankAccountList) {
            System.out.printf("Owner: %s has a balance of: $%.2f%n", bankAccount.getOwner(), bankAccount.checkBalance());
        }
    }
}