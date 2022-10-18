package Practice;

public class Bank
{
    int AccNo;
    String HolderName;
    String Branch;
    String Address;
    int Balance;
//
//    public int Bank(int accNo, String holderName, String branch, String address, int balance) {
//        AccNo = accNo;
//        HolderName = holderName;
//        Branch = branch;
//        Address = address;
//        Balance = balance;
//

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
class Deposit extends Bank{
    public static void main(String[] args) {

    }
}
