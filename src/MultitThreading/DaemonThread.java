package MultitThreading;

public class DaemonThread extends Thread
{
        @Override
        public void run() {
            System.out.println("run method");
        }

        public static void main(String[] args) {
            DaemonThread t1 = new DaemonThread();
            t1.setDaemon(true);
            t1.start();
            System.out.println(t1.isDaemon());
        }
    }

