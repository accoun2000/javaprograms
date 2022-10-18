package MultitThreading;

public class SleepMethod extends Thread
{
    @Override
    public void run() {
        System.out.println("In run method.");
        for(int i = 0;i<=5;i++){
            try{                                                                //main thread...
                System.out.println(Thread.currentThread().getName()+" ");       //we cannot start same thread twice
                Thread.sleep(1000l);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class Sleepimpl{
    public static void main(String[] args) {
        SleepMethod t1 = new SleepMethod();
        t1.setName("T1");
        SleepMethod t2 = new SleepMethod();
        t2.setName("T2");
        t1.start();
        t2.start();
    }
}
