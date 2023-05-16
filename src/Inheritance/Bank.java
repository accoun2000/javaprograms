package Inheritance;

public class Bank
{
    static int AccNo;
    static String IFSCcode;
}
class SBI extends Bank {
    public static int contactNo;
    static String address;
    static String BranchCode;

    static void display() {
        System.out.println("AccNo.:" +AccNo);
        System.out.println("IFSCcode:" +IFSCcode);
        System.out.println("address:" +address);
        System.out.println("contactNo:" +contactNo);
        System.out.println("BranchCode:" +BranchCode);
    }
}
class Bankimpl{
    public static void main(String[] args) {
       SBI sbi = new SBI();
       SBI.AccNo = 464646538;
       SBI.IFSCcode = "sbi7564743";
       SBI.address = "Kothrud,Pune";
       SBI.contactNo = 855368563;
       SBI.BranchCode = "SBI1002434";
       SBI.display();

    }
}