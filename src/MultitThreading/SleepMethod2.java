package MultitThreading;

public class SleepMethod2 implements Runnable {
    @Override
    public void run() {
        System.out.println("In run method.");
        for(int i = 0;i<=5;i++){
            try{
                System.out.println(Thread.currentThread().getName()+" ");
                Thread.sleep(1000l);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class Sleep2impl{
    public static void main(String[] args) {
        SleepMethod2 th1 = new SleepMethod2();

    }
}
