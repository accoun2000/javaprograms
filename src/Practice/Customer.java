package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer
{
    private Integer id;
    private String name;
    private Integer mobileno;
    private String email;

    public Customer(Integer id, String name, Integer mobileno, String email) {
        this.id = id;
        this.name = name;
        this.mobileno = mobileno;
        this.email = email;
    }
}
class Transactions{
    private String transactioType;
    private Integer accountNumber;
    private Double amount;
    private Customer customer;
    public Transactions(){

    }

    public Transactions(String transactioType, Integer accountNumber, Double amount, Customer customer) {
        this.transactioType = transactioType;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.customer = customer;
    }

    public String getTransactioType() {
        return transactioType;
    }

    public void setTransactioType(String transactioType) {
        this.transactioType = transactioType;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Customer getCustomer(){
        return customer;
    }
}
class CustomerImpl {
    List<Transactions> transactionsList = new ArrayList<>();
    public static void main(String[] args) {
        CustomerImpl customerimpl = new CustomerImpl();
        Customer customer = new Customer(1, "Abc", 783673, "abc@gmail.com");
        int ch;
        do {
            System.out.println("1.Add transaction");
            System.out.println("2.Get Balance");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter transaction type:");
                    String transactionType = sc.next();
                    System.out.println("Enter account no:");
                    Integer accountno = sc.nextInt();
                    System.out.println("Enter amount:");
                    Double amount = sc.nextDouble();
                    customerimpl.addTransaction(transactionType,accountno,amount,customer);
                }
                case 2 -> {
                    System.out.println("Enter account no:");
                    Integer acc = sc.nextInt();
                    customerimpl.getBalance(acc);
                    break;
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid option");
            }
        } while (ch <= 3);
    }
private void addTransaction(String transactionType, Integer acountNo, Double amount, Customer customer){
    Transactions transactions = new Transactions(transactionType,acountNo,amount,customer);
    transactionsList.add(transactions);
}
void  getBalance(Integer accountNumber){
    System.out.println("Transaction List"+transactionsList.size());
    for(Transactions t : transactionsList){
        System.out.println("t.getAccountNumber:"+t.getAccountNumber());
        System.out.println("accountNumber:"+accountNumber);
        if(t.getAccountNumber() == accountNumber){
            System.out.println(t.getAccountNumber()+" "+t.getTransactioType()+" "+t.getAmount());
             }
        }
    }
}