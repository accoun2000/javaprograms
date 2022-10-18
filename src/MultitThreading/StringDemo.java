package MultitThreading;


class StringDemo{
    public void PrintName(String name){
        String result = "name";
        for(int i = 0;i<=5;i++){
            try{
                Thread.sleep(1000l);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}
class StringEx extends  StringDemo{
    StringDemo stringDemo = new StringDemo();
    String name ;

    @Override
    public void PrintName(String name) {

    }
}
