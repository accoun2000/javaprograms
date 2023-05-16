package MultitThreading;

public class ThreadClassDemo extends Thread
{
    @Override
    public void run() {
        System.out.println("THREAD IN RUNNABLE STATE");             //runnable do not have start() method
    }
}
