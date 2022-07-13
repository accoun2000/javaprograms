package finalkeyword;

public class Person {
    int empId;
    String name;
    final String PAN_NO = "AMFT3243L";
    final String AADHAR_NO;
    final static String BIRTH_DATE;
    final String MobileNo;
    Person(String mobileNo)
    {
        MobileNo = mobileNo;
        AADHAR_NO = "8462837465582937";
    }
    static
    {
        BIRTH_DATE = "15/09/1998";
    }
    Person(String mobileno,String aadhar_no)
    {
        AADHAR_NO = aadhar_no;
        MobileNo = mobileno;
    }
}
class Personimpl
{
        final public static void main(String[] args)
        {
        Person person = new Person("7865676587","8462837465582937");
    }
}

