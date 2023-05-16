package MultitThreading;

public class RunMethod extends Thread
{
    @Override
    public void run() {
        System.out.println("In run method");
        for(int i = 0;i<=5;i++){
            try{
                Thread.sleep(1000l);
                System.out.println(Thread.currentThread().getName()+" ");
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class RunMethodimpl{
    public static void main(String[] args) {
        RunMethod t1 = new RunMethod();
        t1.run();
    }
}
