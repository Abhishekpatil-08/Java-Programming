package Package_1;

public class ConsolePrintable implements Printable{
    @Override
   public void Print(String msg){
        System.out.println("printing msg on Console:"+msg);
    }
}
