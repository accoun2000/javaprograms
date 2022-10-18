package MultitThreading;

class Table{
    synchronized void PrintTable(int no){
        int result = 1;
        for(int i = 1;i<=10;i++){
            try{
                Thread.sleep(500l);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(no * i);
        }
    }
}
class ThreadTableOne extends Thread{
    Table table = new Table();
    int no;
    ThreadTableOne(Table table){
        this.table = table;
        this.no = no;
    }

    @Override
    public void run() {
        table.PrintTable(8);
    }
}
class ThreadTableTwo extends  Thread{
    Table table = new Table();
    int no;
    ThreadTableTwo(Table table){
        this.table = table;
        this.no = no;
    }

    @Override
    public void run() {
        table.PrintTable(5);
    }
}
public class SynchronisationDemo
{
    public static void main(String[] args) {
        Table table = new Table();
        ThreadTableOne t1 = new ThreadTableOne(table);
        ThreadTableTwo t2 = new ThreadTableTwo(table);
        t1.start();
        t2.start();

    }
}
