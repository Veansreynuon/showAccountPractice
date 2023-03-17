package interfaceDemo;

public class CreditCardAccount implements Account{
    private double balance;
    private float interesrate;
    private double limitCredit;
    CreditCardAccount(){
        balance=10;
        interesrate = 30;
        limitCredit = 100;
    }
    public void  withdraw(double amount){
        if(amount<=balance){
            if(amount<= balance){
                balance -= amount;
            }else {
                System.out.println("Insufficient balance: ");
            }
        }else {
            System.out.println("Amount exceed the limit !!!");
        }
    }

    public  void deposit(double amount){
        balance += amount;
    }
    public double checkBalance(){
        return balance;
    }
    public double calculateInterest(){
        return balance * (interesrate/100);
    }
}
