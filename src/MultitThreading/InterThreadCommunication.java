package MultitThreading;

class Bank
{
    int totalAmount = 0;
    void deposit(int amount){
        totalAmount+=amount;
        System.out.println("TotalAmount"+totalAmount);
        notify();
    }
    void withdraw(int amount) throws InterruptedException{
        if(amount > totalAmount){
            System.out.println("Insufficient Balance");
            wait();
        }
        totalAmount-=amount;
        System.out.println("Remaining amount:"+totalAmount);
    }
}

public class InterThreadCommunication{
    public static void main(String[] args) {
     Bank bank = new Bank();
     new Thread(() -> {
         try{
             bank.withdraw(100);
         }
         catch(InterruptedException e){
             throw new RuntimeException(e);
         }
     }).start();
     new Thread(() -> bank.deposit(500)).start();
    }
}
