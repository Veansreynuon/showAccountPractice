package interfaceDemo;

public class BankingService {
    SavingAccount savingAccount;
    CreditCardAccount creditCardAccount;
    BankingService(){
        savingAccount = new SavingAccount();
        creditCardAccount = new CreditCardAccount();
    }
    BankingService(SavingAccount savingAccount, CreditCardAccount creditCardAccount){
        this.savingAccount = savingAccount;
        this.creditCardAccount = creditCardAccount;
    }
    double showBalance(){
        return savingAccount.checkBalance();
    }
    double showCreditCardBalance(){
        return creditCardAccount.checkBalance();
    }
    void addCreditCardMoney(double amount){
        creditCardAccount.deposit(amount);
    }
    void addMoney(double amount){
        savingAccount.deposit(amount);
    }
    void withdrawMoney(double amount){
        savingAccount.withdraw(amount);
    }

}
