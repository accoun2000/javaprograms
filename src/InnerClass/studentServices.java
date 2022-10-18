package InnerClass;

public interface studentServices
{
    void getStudent();
    void addStudent(int rno,String name);
}
class studentServicesImpl{

    public static void main(String[] args) {
        studentServices studentServices = new studentServices() {
            int rno;
            String name;
            @Override
            public void getStudent() {
                System.out.println(rno+" "+name);
            }

            @Override
            public void addStudent(int rno, String name) {
               this.rno = rno;
               this.name = name;
            }
        };
        studentServices.getStudent();
        studentServices.addStudent(1,"asdasd");
    }
}
