package java8;

public interface Message
{
    void sendmsg();
    default void sendPicture(){
        System.out.println("Send message");
    }


}
class SendMessage implements  Message{
    @Override
    public void sendmsg() {
        System.out.println("Send Message");
    }
}
class MessageImpl{
    public static void main(String[] args) {
        Message message = new SendMessage();
        message.sendmsg();
        message.sendPicture();

        Message sendMessage = ()->{
            System.out.println("In lambda");
        };
        sendMessage.sendmsg();
        sendMessage.sendPicture();
    }
}
