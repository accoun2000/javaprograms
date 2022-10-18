package java8;

import java.util.Date;

public interface UserServices
{
    void addUser();
    default void sendWelcomeMessage(String username ){
        System.out.println("Welcome."+username);
    }
    static Date getCurrentdate(){
        return new Date(System.currentTimeMillis());
    }
}
class user implements  UserServices{
    @Override
    public void addUser() {

    }

    @Override
    public void sendWelcomeMessage(String username) {
        System.out.println("Welcome."+username);
    }
}
class UserImpl{
    public static void main(String[] args) {
        UserServices userServices = new user();
        userServices.addUser();
        userServices.sendWelcomeMessage("codekul");
        System.out.println(UserServices.getCurrentdate());
    }
}
