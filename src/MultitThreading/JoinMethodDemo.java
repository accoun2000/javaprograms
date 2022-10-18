package MultitThreading;

public class JoinMethodDemo extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(500l);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("In run method"+Thread.currentThread().getName()+" ");
    }
}
class JoinMethodDemoimpl{                    //randomly any thread runs......its is giving unordered output
    public static void main(String[] args) throws InterruptedException {
        JoinMethodDemo t1 = new JoinMethodDemo();
        JoinMethodDemo t2 = new JoinMethodDemo();
        JoinMethodDemo t3 = new JoinMethodDemo();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }

}