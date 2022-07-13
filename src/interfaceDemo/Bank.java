package interfaceDemo;

public interface Bank
{
    double getRateOfInterest();
    float N = 10;
}
interface BankOperations extends Bank{
    double calculateInterest();
}
class HDFC implements BankOperations{

    @Override
    public double getRateOfInterest() {
        return 10;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
class Bankimpl{
    public static void main(String[] args) {
        BankOperations bank ;
        bank = new HDFC();
        bank.getRateOfInterest();
        bank.calculateInterest();
    }
}
